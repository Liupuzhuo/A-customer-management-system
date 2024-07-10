package com.example.common.exception;


import com.example.domain.enumeration.ResponseCodeEnum;

public class UnauthorizedException extends RuntimeException {

    private Integer code;
    private String message;

    public UnauthorizedException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum.getMessage());
        this.code = responseCodeEnum.getFinalCode();
        this.message = responseCodeEnum.getMessage();
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
}
