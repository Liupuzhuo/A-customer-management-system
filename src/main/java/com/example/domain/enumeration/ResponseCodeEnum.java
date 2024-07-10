package com.example.domain.enumeration;

/**
 * 响应码枚举
 *
 */
public enum ResponseCodeEnum {

    /*
    模块业务编码

    11 用户
    */

    /**
     * 调用成功
     */
    SUCCESS(null, "200", "成功", "OK"),

    /**
     * 404
     */
    NOT_FOUND(null, "404", "请求资源不存在", "Not Found"),

    /**
     * 调用失败
     */
    FAIL(null, "500", "失败", "Internal Server Error"),
    /**
     * 传参异常
     */
    ARGS_NOT_VALID_EXCEPTION(Type.PARAMETER_ERROR, "001", "传参异常", "Parameter error"),
    /**
     * 非法请求
     */
    AUTHENTICATION_ILLEGAL_REQUEST(Type.PARAMETER_ERROR, "002", "非法请求", "Illegal request"),
    /**
     * 系统繁忙
     */
    SYSTEM_BUSY_EXCEPTION(Type.PARAMETER_ERROR, "003", "很抱歉，系统繁忙，请稍候再试", "I'm busy right now, sorry"),
    /**
     *  无权访问
     */
    NO_PERMISSION_ACCESS(Type.PARAMETER_ERROR, "004", "您没有执行该操作的权限，请联系管理员进行操作。", "Have no right to access"),

    /**
     *  未登录
     */
    LOGIN_REQUIRED(Type.PARAMETER_ERROR, "005", "尚未登录，无访问权限", "Login required"),
    /**
     * 无效token
     */
    INVALID_TOKEN(Type.PARAMETER_ERROR, "006", "无效token", "Invalid token"),
    /**
     * 未知异常
     */
    UNKNOWN_EXCEPTION(Type.SYSTEM_ERROR, "999", "未知异常", "Unknown exception"),

    USER_EXISTS(Type.BUSINESS_ERROR, "1101", "用户已存在", "The user identifier already exists"),

    USER_OR_PASSWORD_NOT_CORRECT(Type.BUSINESS_ERROR, "1109", "用户名或密码不正确", "Username or password not correct"),

    ;


    public static final String ERROR_CODE_PREFIX = "";

    private final String code;

    private final String message;

    private final String messageEn;

    private final Type errorType;

    ResponseCodeEnum(Type errorType, String code, String message, String messageEn) {
        this.code = code;
        this.message = message;
        this.messageEn = messageEn;
        this.errorType = errorType;
    }

    public Integer getFinalCode() {
        if (this.errorType == null) {
            return Integer.valueOf(code);
        } else {
            String code = ERROR_CODE_PREFIX + errorType.code + this.code;
            return Integer.valueOf(code);
        }
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageEn() {
        return messageEn;
    }

    /**
     * 错误类型枚举
     */
    public enum Type {

        /**
         * 参数错误
         */
        PARAMETER_ERROR("10"),
        /**
         * 业务错误
         */
        BUSINESS_ERROR("20"),
        /**
         * 系统错误
         */
        SYSTEM_ERROR("30"),
        /**
         * 网络错误
         */
        NETWORK_ERROR("40"),
        /**
         * 数据库错误
         */
        DATABASE_ERROR("50"),
        /**
         * 缓存错误
         */
        CACHE_ERROR("60"),
        /**
         * 其他错误
         */
        OTHERS("70"),
        ;

        private String code;

        Type(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }
}

