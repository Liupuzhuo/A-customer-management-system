package com.example.common.result;


import com.example.domain.enumeration.ResponseCodeEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * 统一返回体
 * @param <T>
 */
public class Resp<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回码
     */
    private int code;

    /**
     * 是否成功
     */
    private boolean success = false;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据载体
     */
    private T data;

    public static <T> Resp<T> success(T data) {
        return new Resp<>(data);
    }

    public static <T> Resp<T> success() {
        return success(null);
    }

    public static <T> Resp<T> fail() {
        return fail(ResponseCodeEnum.FAIL);
    }

    public static <T> Resp<T> fail(Integer code, String message) {
        return new Resp<T>(code, message);
    }

    public static <T> Resp<T> fail(ResponseCodeEnum responseCodeEnum) {
        return new Resp<T>(responseCodeEnum);
    }

    public static <T> Resp<T> fail(String msg) {
        return new Resp<T>(ResponseCodeEnum.FAIL.getFinalCode(), msg);
    }

    public Resp(Integer code, String message) {
        this(code, message, null);
    }

    public Resp(Integer code, String message, T data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
        this.setSuccess(Objects.equals(ResponseCodeEnum.SUCCESS.getFinalCode(), code));
    }

    public Resp(T data) {
        this.setCode(ResponseCodeEnum.SUCCESS.getFinalCode());
        this.setMessage(ResponseCodeEnum.SUCCESS.getMessage());
        this.setSuccess(Boolean.TRUE);
        this.setData(data);
    }

    public Resp(ResponseCodeEnum e, T data) {
        this.setCode(e.getFinalCode());
        this.setMessage(e.getMessage());
        this.setData(data);
        this.setSuccess(Objects.equals(ResponseCodeEnum.SUCCESS.getFinalCode(), this.code));
    }

    public Resp(ResponseCodeEnum e) {
        this.setCode(e.getFinalCode());
        this.setMessage(e.getMessage());
        this.setSuccess(Objects.equals(ResponseCodeEnum.SUCCESS.getFinalCode(), this.code));
    }

    public boolean ok() {
        return Objects.equals(ResponseCodeEnum.SUCCESS.getFinalCode(), this.code) || this.success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Resp{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }
}
