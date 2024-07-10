package com.example.service;

import com.example.domain.constant.WeChatConstant;
import com.example.domain.model.JsCodeSessionResponse;
import com.example.domain.model.JsapiPrepayRequest;
import com.example.domain.model.JsapiPrepayResponse;
import com.example.domain.model.WechatLoginPhone;
import com.wechat.pay.java.core.Config;
import com.wechat.pay.java.core.RSAAutoCertificateConfig;
import com.wechat.pay.java.core.notification.NotificationConfig;
import com.wechat.pay.java.core.notification.NotificationParser;
import com.wechat.pay.java.service.payments.model.Transaction;
import com.wechat.pay.java.service.payments.jsapi.JsapiService;
import com.wechat.pay.java.service.payments.jsapi.JsapiServiceExtension;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public interface JsapiPayService {

    default Config getConfig() {
        InputStream privateKeyPathStream = this.getClass().getClassLoader().getResourceAsStream(WeChatConstant.PRIVATE_KEY_PATH);
        return new RSAAutoCertificateConfig.Builder()
                        .merchantId(WeChatConstant.MERCHANT_ID)
                        .privateKey(getStreamString(privateKeyPathStream))
                        .merchantSerialNumber(WeChatConstant.MERCHANT_SERIAL_NUMBER)
                        .apiV3Key(WeChatConstant.API_V3_KEY)
                        .build();
    }

    default NotificationConfig getNotificationConfig(){
        InputStream privateKeyPathStream = this.getClass().getClassLoader().getResourceAsStream(WeChatConstant.PRIVATE_KEY_PATH);
        return new RSAAutoCertificateConfig.Builder()
                .merchantId(WeChatConstant.MERCHANT_ID)
                .privateKey(getStreamString(privateKeyPathStream))
                .merchantSerialNumber(WeChatConstant.MERCHANT_SERIAL_NUMBER)
                .apiV3Key(WeChatConstant.API_V3_KEY)
                .build();
    }

    default String getStreamString(InputStream stream) {
        try {
            return IOUtils.toString(stream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    default NotificationParser getNotificationParser() {
        return new NotificationParser(getNotificationConfig());
    }

    default JsapiService getJsapiService() {
        return new JsapiService.Builder().config(getConfig()).build();
    }

    default JsapiServiceExtension getJsapiServiceExtension() {
        return new JsapiServiceExtension.Builder().config(getConfig()).signType("RSA").build();
    }

    /**
     * 预支付
     * @param jsapiPrepayRequest
     * @return
     */
    JsapiPrepayResponse prepay(JsapiPrepayRequest jsapiPrepayRequest);

    /**
     * 微信支付订单号查询订单
     * @param transactionId
     * @return
     */
    com.wechat.pay.java.service.payments.model.Transaction queryOrderById(String transactionId);

    /**
     * 商户订单号查询订单
     * @param outTradeNo
     * @return
     */
    com.wechat.pay.java.service.payments.model.Transaction queryOrderByOutTradeNo(String outTradeNo);

    /**
     * 关闭订单
     * @param outTradeNo
     */
    void closeOrder(String outTradeNo);

    /**
     * code to session
     * @param jsCode
     * @return
     */
    JsCodeSessionResponse jscode2Session(String jsCode);

    /**
     * 解析回调
     * @param requestBody
     * @return
     */
    Transaction parseNotification(String requestBody);

    /**
     * 获取微信手机号
     * @param data
     * @param jscode
     * @param iv
     * @return
     */
    WechatLoginPhone wxDecryptPhone(String data, String jscode, String iv);
}
