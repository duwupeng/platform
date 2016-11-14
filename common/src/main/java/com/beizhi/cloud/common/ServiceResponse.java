package com.beizhi.cloud.common;

/**
 * Created by eric on 16/11/11.
 */
public class ServiceResponse<T> {
    T response;

    int code=0;
    String message="SUCESS";

    boolean isBizError=false;


    public ServiceResponse(T response) {
        this.response = response;
    }
    public ServiceResponse(T response,ExceptionEnums emue) {
        this.response = response;

    }

}
