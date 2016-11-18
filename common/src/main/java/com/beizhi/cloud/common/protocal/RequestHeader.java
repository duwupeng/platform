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

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CallerFrom getCallerFrom() {
        return callerFrom;
    }

    public void setCallerFrom(CallerFrom callerFrom) {
        this.callerFrom = callerFrom;
    }

    public String getCallerIP() {
        return callerIP;
    }

    public void setCallerIP(String callerIP) {
        this.callerIP = callerIP;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
