package com.beizhi.cloud.front.common;

/**
 * Created by eric on 16/11/10.
 */
public class ServiceException extends RuntimeException{
    private OpenServiceErrEnum openServiceErrEnum;
    public ServiceException(OpenServiceErrEnum openServiceErrEnum){
        this.openServiceErrEnum = openServiceErrEnum;
    }
    public OpenServiceErrEnum getOpenServiceErrEnum(){
        return openServiceErrEnum;
    }

    public void setOpenServiceErrEnum(OpenServiceErrEnum openServiceErrEnum) {
        this.openServiceErrEnum = openServiceErrEnum;
    }
}