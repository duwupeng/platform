package com.beizhi.cloud.common;

/**
 * Created by eric on 16/11/10.
 */
//系统异常, 比如 SQL, 数组越界,nullException
public interface ExceptionEnums {
    public int getCode();
    public String getMessage();
}
