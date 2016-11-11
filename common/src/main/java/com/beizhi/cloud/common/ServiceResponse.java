package com.beizhi.cloud.common;

/**
 * Created by eric on 16/11/11.
 */
public class ServiceResponse<T> {
    T response;
    Status status;
}
class Status{
    int code;
    String message;
}
