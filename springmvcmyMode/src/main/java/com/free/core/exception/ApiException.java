package com.free.core.exception;

/**
 * Created by ytl on 16/7/8.
 */
public class ApiException extends RuntimeException {

    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ApiException(){}

    public ApiException(String errorCode) {
        this.errorCode = errorCode;
    }
}
