package com.example.common.exception;


import com.example.domain.enumeration.ResponseCodeEnum;
import com.example.common.result.Resp;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Path;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义业务异常
     */
    @ExceptionHandler(value = BusinessException.class)
    public Resp bizExceptionHandler(BusinessException e) {
        log.warn("BizException: errCode:{}, errMsg: {} ", e.getCode(), e.getMessage(), e);
        return Resp.fail(e.getCode(), e.getMessage());
    }


    /**
     * 其他未处理异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = ServerException.class)
    public Resp serverExceptionHandler(ServerException e) {
        log.error("ServerException: errCode:{}, errMsg: {} ", e.getCode(), e.getMessage(), e);
        return Resp.fail(e.getMessage());
    }

    /**
     *处理基础异常
     */
    @ExceptionHandler(value = BaseException.class)
    public Resp baseExceptionHandler(BaseException e) {
        log.error("BaseException: errCode:{}, errMsg: {} ", e.getCode(), e.getMessage(), e);
        return Resp.fail();
    }

    /**
     * 统一处理请求参数校验(实体对象传参)
     *
     * @param e BindException
     * @return Result
     */
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Resp handleBindException(BindException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            message.append("[" + error.getField() + "]").append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString());
        return Resp.fail(message.toString());
    }

    /**
     * 统一处理请求参数校验(普通传参)
     *
     * @param e ConstraintViolationException
     * @return Result
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Resp handleConstraintViolationException(ConstraintViolationException e) {
        StringBuilder message = new StringBuilder();
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        for (ConstraintViolation<?> violation : violations) {
            Path path = violation.getPropertyPath();
            String[] pathArr = StringUtils.splitByWholeSeparatorPreserveAllTokens(path.toString(), ".");
            message.append(pathArr[1]).append(violation.getMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString());
        return Resp.fail(message.toString());
    }

    /**
     * 统一处理请求参数校验(json)
     *
     * @param e ConstraintViolationException
     * @return CommonResult
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Resp handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        StringBuilder message = new StringBuilder();
        for (FieldError error : e.getBindingResult().getFieldErrors()) {
            message.append("[" + error.getField() + "]").append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        log.error(message.toString());
        return Resp.fail(ResponseCodeEnum.ARGS_NOT_VALID_EXCEPTION.getFinalCode(),
                ResponseCodeEnum.ARGS_NOT_VALID_EXCEPTION.getMessage() + "：" + message);
    }

    /**
     * 资源权限访问不足
     * @return
     */
    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Resp handleAccessDeniedException() {
        return Resp.fail("没有权限访问该资源");
    }

    /**
     * 媒体类型不支持
     * @param e
     * @return
     */
    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        String message = "该方法不支持" + StringUtils.substringBetween(e.getMessage(), "'", "'") + "媒体类型";
        log.error(message);
        return Resp.fail(message);
    }

    /**
     * http方法不支持
     * @param e
     * @return
     */
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        String message = "该方法不支持" + StringUtils.substringBetween(e.getMessage(), "'", "'") + "请求方法";
        log.error(message);
        return Resp.fail(message);
    }


    /**
     * 请求体异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public Resp handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error(e.getMessage(), e);
        if (e.getCause() instanceof  InvalidFormatException) {
            InvalidFormatException ifx = (InvalidFormatException) e.getCause();
            List<String> field = ifx.getPath().stream().map(JsonMappingException.Reference::getFieldName).collect(Collectors.toList());
            return Resp.fail("传参异常，请检查字段:" + field);
        }
        return Resp.fail("传参异常,请检查请求体");
    }

    /**
     * 缺少 Param 请求参数异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public Resp handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        log.error("缺少 Param 请求参数异常:{}", e.getMessage(), e);
        return Resp.fail(e.getMessage());
    }


    /**
     * 空结果数据访问异常
     * @param e
     * @return
     */
    @ResponseStatus
    @ExceptionHandler(value = EmptyResultDataAccessException.class)
    public Resp handleEmptyResultDataAccessException(EmptyResultDataAccessException e) {
        log.error("访问数据不存在异常:{}", e.getMessage(), e);
        return Resp.fail("数据不存在！");
    }

    /**
     * 认证异常
     * @param e
     * @return
     */
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = UnauthorizedException.class)
    public Resp handleUnauthorizedException(UnauthorizedException e, HttpServletRequest request) {
        Resp<Object> resp = Resp.fail(e.getCode(), e.getMessage());
        return resp;
    }


    /**
     * 处理其他异常
     */
    @ResponseStatus
    @ExceptionHandler(value = Exception.class)
    public Resp otherExceptionHandler(Exception e) {
        log.error("OtherException: {}", e.getMessage(), e);
        return Resp.fail(ResponseCodeEnum.SYSTEM_BUSY_EXCEPTION.getFinalCode(),
                Optional.of(e.getMessage()).orElse(ResponseCodeEnum.SYSTEM_BUSY_EXCEPTION.getMessage()));
    }

}
