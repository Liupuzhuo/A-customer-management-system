package com.example.common.exception;

import org.apache.commons.lang3.StringUtils;
import com.example.domain.enumeration.ResponseCodeEnum;

public class BaseException extends RuntimeException {

    protected Integer code;
    protected String message;
    protected ResponseCodeEnum responseCodeEnum;

    public BaseException(ResponseCodeEnum responseCodeEnum) {
        this.code = responseCodeEnum.getFinalCode();
        this.message = responseCodeEnum.getMessage();
        this.responseCodeEnum = responseCodeEnum;
    }

    public BaseException(ResponseCodeEnum responseCodeEnum, String addedMessage) {
        this.code = responseCodeEnum.getFinalCode();
        if (StringUtils.isNotBlank(addedMessage)) {
            this.message = responseCodeEnum.getMessage() + ", " + addedMessage;
        } else {
            this.message = responseCodeEnum.getMessage();
        }
        this.responseCodeEnum = responseCodeEnum;
    }

    public BaseException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    public BaseException(String message, Integer code, String message1) {
        super(message);
        this.code = code;
        this.message = message1;
    }

    public BaseException(String message, Throwable cause, Integer code, String message1) {
        super(message, cause);
        this.code = code;
        this.message = message1;
    }

    public BaseException(Throwable cause, Integer code, String message) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseCodeEnum getResponseCodeEnum() {
        return responseCodeEnum;
    }

    public void setResponseCodeEnum(ResponseCodeEnum responseCodeEnum) {
        this.responseCodeEnum = responseCodeEnum;
    }
}
