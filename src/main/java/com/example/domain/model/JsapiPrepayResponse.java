package com.example.domain.model;

/**
 * Jsapi预支付Response
 */
public class JsapiPrepayResponse {
    /** prepayId 说明：预支付交易会话标识 */
    private String prepayId;
    /** appId 说明：appId */
    private String appId;
    /** timestamp 说明：时间戳 */
    private String timestamp;
    /** nonceStr 说明：随机字符串 */
    private String nonceStr;
    /** packageVal 说明：预支付交易会话标识 */
    private String packageVal;
    /** signType 说明：签名算法 */
    private String signType;
    /** paySign 说明：签名 */
    private String paySign;

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPackageVal() {
        return packageVal;
    }

    public void setPackageVal(String packageVal) {
        this.packageVal = packageVal;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }
}
