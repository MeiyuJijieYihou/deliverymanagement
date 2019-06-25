package com.zhaofeng.deliverymanagement.exception;

import org.springframework.http.HttpStatus;

/**
 * BeanUtils exception.
 *
 * @author zhaofeng
 * @date 2019/6/25
 */
public class BeanUtilsException extends BaseException {

    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
