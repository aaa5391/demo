package com.free.core.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.free.core.constants.ErrorCode;
import com.free.core.vo.ResponseData;




/**
 * Created by ytl on 16/7/22.
 */
@ControllerAdvice
public class GlobalExceptionHandlerAdvice {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseData handleException(Exception ex) {
        ex.printStackTrace();
        StringWriter sw = new StringWriter();   
        PrintWriter pw = new PrintWriter(sw, true);   
        ex.printStackTrace(pw);   
        pw.flush();   
        sw.flush();
        return  new ResponseData(ErrorCode.INTERNAL_SERVER_ERROR,sw.toString());   
//        if(ex instanceof ApiException) {
//            return new ResponseData(((ApiException) ex).getErrorCode());
//        }
//        return new ResponseData(ErrorCode.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
}
