package com.example.common.exception;


import com.example.domain.enumeration.ResponseCodeEnum;

public class ServerException extends BaseException {

    public ServerException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum);
    }

    public ServerException(Integer code, String message) {
        super(code, message);
    }

    public ServerException(String message) {
        super(500, message);
    }

    public ServerException(String message, Integer code, String message1) {
        super(message, code, message1);
    }

    public ServerException(String message, Throwable cause, Integer code, String message1) {
        super(message, cause, code, message1);
    }

    public ServerException(Throwable cause, Integer code, String message) {
        super(cause, code, message);
    }

    public ServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code, String message1) {
        super(message, cause, enableSuppression, writableStackTrace, code, message1);
    }
}
