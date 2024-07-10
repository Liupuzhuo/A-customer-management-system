package com.example.common.exception;


import com.example.domain.enumeration.ResponseCodeEnum;

public class BusinessException extends BaseException{

    protected Object data;

    public BusinessException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum);
    }

    public BusinessException(ResponseCodeEnum responseCodeEnum, String addedMessage) {
        super(responseCodeEnum, addedMessage);
    }

    public BusinessException(String message) {
        super(500, message);
    }

    public BusinessException(Integer code, String message) {
        super(code, message);
    }

    public BusinessException(String message, Integer code, String message1) {
        super(message, code, message1);
    }

    public BusinessException(String message, Throwable cause, Integer code, String message1) {
        super(message, cause, code, message1);
    }

    public BusinessException(Throwable cause, Integer code, String message) {
        super(cause, code, message);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace, code, message1);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
