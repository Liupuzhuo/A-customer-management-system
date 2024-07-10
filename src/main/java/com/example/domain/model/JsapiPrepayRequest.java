package com.example.domain.model;

/**
 * Jsapi预支付请求参数
 */
public class JsapiPrepayRequest {
    private String appid;
    /** 商品描述 说明：商品描述 */
    private String description;
    /** 商户订单号 说明：商户订单号 */
    private String outTradeNo;
    /** 通知地址 说明：有效性：1. HTTPS；2. 不允许携带查询串。 */
    private String notifyUrl;
    /** 总金额 说明：订单总金额，单位为分 */
    private Integer totalAmount;
    /** 用户标识 说明：用户在商户appid下的唯一标识。 */
    private String openid;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
