package com.beizhi.cloud.common.protocal;

/**
 * 请求头
 * Created by eric on 16/11/14.
 */
public class RequestHeader {
    /**
     * 操作人ID
     *
     */
    public int operatorId; // required
    /**
     * 操作人名称
     *
     */
    public String operatorName; // required
    /**
     * 客户编号
     *
     */
    public int customerId; // required
    /**
     * 客户名称
     *
     */
    public String customerName; // optional
    /**
     * 调用源
     *
     *
     * @see CallerFrom
     */
    public CallerFrom callerFrom; // optional
    /**
     * 调用源IP
     *
     */
    public String callerIP; // optional
    /**
     * 会话编号
     *
     */
    public String sessionId; // optional
}
