package com.beizhi.cloud.common;

/**
 *
 * Created by eric on 16/11/11.
 */
public class ServiceResponse<T> {
    //返回范型
    T response;

    //返回码
    int code=0;

    //返回消息
    String message="SUCESS";

    //是否为业务异常
    boolean isBizError=false;

    PageResponse pageResponse;

    public ServiceResponse(T response) {
        this.response = response;
    }

    public ServiceResponse(T response,ExceptionEnums exEnum) {
        this.response = response;
        this.code = exEnum.getCode();
        this.message = exEnum.getMessage();
    }


    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isBizError() {
        return isBizError;
    }

    public void setBizError(boolean bizError) {
        isBizError = bizError;
    }

    public PageResponse getPageResponse() {
        return pageResponse;
    }

    public void setPageResponse(PageResponse pageResponse) {
        this.pageResponse = pageResponse;
    }
}
