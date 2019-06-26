package com.zhaofeng.deliverymanagement.exception;

import org.springframework.http.HttpStatus;

/**
 * Exception caused by bad request.
 *
 * @author zhaofeng
 * @date 2019/6/26
 */

public class BadRequestException extends BaseException {

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
