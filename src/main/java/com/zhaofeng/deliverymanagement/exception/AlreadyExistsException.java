package com.zhaofeng.deliverymanagement.exception;

/**
 * Exception caused by entity existence already.
 *
 * @author zhaofeng
 * @date 2019/6/26
 */

public class AlreadyExistsException extends BadRequestException {

    public AlreadyExistsException(String message) {
        super(message);
    }

    public AlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

}
