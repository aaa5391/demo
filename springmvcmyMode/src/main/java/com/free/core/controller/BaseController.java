package com.free.core.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.free.core.exception.ApiException;
import com.free.core.vo.ResponseData;



/**
 * Created by ytl on 16/7/8.
 */
public class BaseController {

    @ExceptionHandler(ApiException.class)
    public ResponseData exceptionHandler(ApiException ex) {
        return new ResponseData(ex.getErrorCode());
    }
}
