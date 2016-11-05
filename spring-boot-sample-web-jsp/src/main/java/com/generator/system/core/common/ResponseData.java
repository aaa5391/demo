package com.generator.system.core.common;

/**
 * Created by ytl on 16/7/7.
 */
public class ResponseData<T> {
    private String result;
    private String msg;
    private long elapsedMilliseconds;
    private T data;

    public ResponseData() {
    	  this.result = ErrorCode.SUCCESS_CODE;
          this.msg = ErrorCode.MSG.get(ErrorCode.SUCCESS_CODE);
    }

    public ResponseData(T data) {
        this.result = ErrorCode.SUCCESS_CODE;
        this.msg = ErrorCode.MSG.get(ErrorCode.SUCCESS_CODE);
        this.data = data;
    }

    public ResponseData(String errorCode) {
        this.result = errorCode;
        this.msg = ErrorCode.MSG.get(errorCode);
    }

    public ResponseData(String errorCode, String errorMsg) {
        this.result = errorCode;
        this.msg = errorMsg;
    }

    public ResponseData(String errorCode, String errorMsg, long elapsedMilliseconds) {
        this.result = errorCode;
        this.msg = errorMsg;
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getElapsedMilliseconds() {
        return elapsedMilliseconds;
    }

    public void setElapsedMilliseconds(long elapsedMilliseconds) {
        this.elapsedMilliseconds = elapsedMilliseconds;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
