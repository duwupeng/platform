package com.beizhi.cloud.common.exception;

/**
 * Created by eric on 16/11/10.
 */
//业务异常
public enum BizEnums implements ExceptionEnums{

    UNIQUE_KEY(10001, "答题生成出错");

    public int code;
    public String message;

	private BizEnums(int code, String message){
        this.code = code;
        this.message = message;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
