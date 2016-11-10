package com.beizhi.cloud.front.common;

/**
 * Created by eric on 16/11/10.
 */
public enum OpenServiceErrEnum implements ExceptionEnums{

    UNIQUE_KEY(10001, "答题生成出错");

    public int code;
    public String message;

	private OpenServiceErrEnum(int code, String message){
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
