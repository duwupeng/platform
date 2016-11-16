package com.beizhi.cloud.common.db.reverser;

import com.beizhi.cloud.common.RequestHeader;

/**
 * Created by kanghong.zhao on 2016-11-16.
 */
public class ServiceRequest<T> {
    
    private T request;
    private RequestHeader requestHeader;
    private PageRequest pageReq;

    public T getRequest() {
        return request;
    }

    public void setRequest(T request) {
        this.request = request;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public PageRequest getPageReq() {
        return pageReq;
    }

    public void setPageReq(PageRequest pageReq) {
        this.pageReq = pageReq;
    }
}
