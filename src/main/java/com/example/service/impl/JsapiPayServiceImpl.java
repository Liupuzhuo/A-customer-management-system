package com.example.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.servlet.JakartaServletUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.example.common.exception.ServerException;
import com.example.common.util.AESUtils;
import com.example.common.util.EntityBuilder;
import com.example.domain.constant.WeChatConstant;
import com.example.domain.model.JsCodeSessionResponse;
import com.example.domain.model.JsapiPrepayRequest;
import com.example.domain.model.JsapiPrepayResponse;
import com.example.domain.model.WechatLoginPhone;
import com.example.service.JsapiPayService;
import com.wechat.pay.java.core.exception.ValidationException;
import com.wechat.pay.java.core.notification.RequestParam;
import com.wechat.pay.java.service.payments.jsapi.model.*;
import com.wechat.pay.java.service.payments.model.Transaction;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@Service
public class JsapiPayServiceImpl implements JsapiPayService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public JsapiPrepayResponse prepay(JsapiPrepayRequest jsapiPrepayRequest) {
        PrepayRequest request = new PrepayRequest();
        request.setAppid(WeChatConstant.APP_ID);
        request.setMchid(WeChatConstant.MERCHANT_ID);
        request.setDescription(jsapiPrepayRequest.getDescription());
        request.setOutTradeNo(jsapiPrepayRequest.getOutTradeNo());
        request.setNotifyUrl(jsapiPrepayRequest.getNotifyUrl());
        request.setAmount(EntityBuilder.of(Amount::new).with(Amount::setCurrency,WeChatConstant.CURRENCY).with(Amount::setTotal, jsapiPrepayRequest.getTotalAmount()).build());
        request.setPayer(EntityBuilder.of(Payer::new).with(Payer::setOpenid,jsapiPrepayRequest.getOpenid()).build());
        PrepayResponse prepayResponse = null;
        try {
            prepayResponse = getJsapiService().prepay(request);
        } catch (Exception e) {
            logger.error("预支付失败：{}", e.getMessage(), e);
            throw new ServerException(e.getMessage());
        }
        PrepayWithRequestPaymentResponse prepayWithRequestPaymentResponse = getJsapiServiceExtension().prepayWithRequestPayment(request);

        JsapiPrepayResponse jsapiPrepayResponse = BeanUtil.copyProperties(prepayWithRequestPaymentResponse, JsapiPrepayResponse.class);
        jsapiPrepayResponse.setPrepayId(prepayResponse.getPrepayId());
        return jsapiPrepayResponse;
    }

    @Override
    public Transaction queryOrderById(String transactionId) {
        QueryOrderByIdRequest request = new QueryOrderByIdRequest();
        request.setMchid(WeChatConstant.MERCHANT_ID);
        request.setTransactionId(transactionId);
        return getJsapiService().queryOrderById(request);
    }

    @Override
    public Transaction queryOrderByOutTradeNo(String outTradeNo) {
        QueryOrderByOutTradeNoRequest request = new QueryOrderByOutTradeNoRequest();
        request.setMchid(WeChatConstant.MERCHANT_ID);
        request.setOutTradeNo(outTradeNo);
        return getJsapiService().queryOrderByOutTradeNo(request);
    }

    @Override
    public void closeOrder(String outTradeNo) {
        CloseOrderRequest request = new CloseOrderRequest();
        request.setMchid(WeChatConstant.MERCHANT_ID);
        request.setOutTradeNo(outTradeNo);
        getJsapiService().closeOrder(request);
    }

    @Override
    public JsCodeSessionResponse jscode2Session(String jsCode) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("appid", WeChatConstant.APP_ID);
        paramMap.put("secret", WeChatConstant.APP_SECRET);
        paramMap.put("js_code", jsCode);
        paramMap.put("grant_type", "authorization_code");
        String jsonResult = HttpUtil.get("https://api.weixin.qq.com/sns/jscode2session", paramMap);
        Map<String, String> resultMap = JSONUtil.toBean(jsonResult, HashMap.class);
        if (resultMap.containsKey("errcode")) {
            throw new ServerException(resultMap.get("errmsg"));
        }
        JsCodeSessionResponse response = JSONUtil.toBean(jsonResult, JsCodeSessionResponse.class);
        response.setSessionKey(resultMap.get("session_key"));
        return response;
    }

    @Override
    public Transaction parseNotification(String requestBody) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String wechatSignature = JakartaServletUtil.getHeader(request, "Wechatpay-Signature", Charset.defaultCharset());
        String wechatPaySerial = JakartaServletUtil.getHeader(request, "Wechatpay-Serial", Charset.defaultCharset());
        String wechatPayNonce = JakartaServletUtil.getHeader(request, "Wechatpay-Nonce", Charset.defaultCharset());
        String wechatTimestamp = JakartaServletUtil.getHeader(request, "Wechatpay-Timestamp", Charset.defaultCharset());
        RequestParam requestParam = new RequestParam.Builder()
                .serialNumber(wechatPaySerial)
                .nonce(wechatPayNonce)
                .signature(wechatSignature)
                .timestamp(wechatTimestamp)
                .body(requestBody)
                .build();
        try {
            // 以支付通知回调为例，验签、解密并转换成 Transaction
            Transaction transaction = getNotificationParser().parse(requestParam, Transaction.class);
            return transaction;
        } catch (ValidationException e) {
            logger.error("sign verification failed", e);
            throw new ServerException("签名验证失败");
        }
    }

    @Override
    public WechatLoginPhone wxDecryptPhone(String data, String jscode, String iv) {
        String userInfo = null;
        try {
            JsCodeSessionResponse codeSessionResponse = this.jscode2Session(jscode);
            userInfo = AESUtils.decrypt(data, codeSessionResponse.getSessionKey(), iv,"AES/CBC/PKCS5Padding");
        } catch (Exception ex) {
            logger.error("解析微信手机号错误:{}", ex.getMessage());
            throw new ServerException("解析微信手机号错误");
        }
        return JSONUtil.toBean(userInfo, WechatLoginPhone.class);
    }
}
