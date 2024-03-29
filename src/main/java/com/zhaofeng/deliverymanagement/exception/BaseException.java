package com.zhaofeng.deliverymanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Base exception of the project.
 *
 * @author zhaofeng
 * @date 2019/6/25
 */

public abstract class BaseException extends RuntimeException {

    /**
     * Error errorData.
     */
    private Object errorData;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    @NonNull
    public abstract HttpStatus getStatus();

    @Nullable
    public Object getErrorData() {
        return errorData;
    }

    /**
     * Sets error errorData.
     *
     * @param errorData error data
     * @return current exception.
     */
    @NonNull
    public BaseException setErrorData(@Nullable Object errorData) {
        this.errorData = errorData;
        return this;
    }
}
