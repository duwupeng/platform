package com.beizhi.cloud.common;

/**
 * 异常包装类
 * Created by eric on 16/11/10.
 */
public class WrappedException extends RuntimeException{
    private ExceptionEnums errEnum;
    public WrappedException(SystemErrEnums openServiceErrEnum){
        this.errEnum = openServiceErrEnum;
    }
    public ExceptionEnums getOpenServiceErrEnum(){
        return errEnum;
    }

    public void setOpenServiceErrEnum(ExceptionEnums openServiceErrEnum) {
        this.errEnum = openServiceErrEnum;
    }
}