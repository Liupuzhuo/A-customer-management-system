package com.example.common.config;

import com.example.common.exception.BusinessException;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.nio.charset.StandardCharsets;

import static feign.FeignException.errorStatus;

public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        FeignException exception = errorStatus(methodKey, response);
        String body = exception.responseBody().map(byteBuffer -> StandardCharsets.UTF_8.decode(byteBuffer).toString()).orElse("");

        if (response.status() != 200) {
            return new BusinessException(response.status(), body);
        }
        return exception;
    }
}
