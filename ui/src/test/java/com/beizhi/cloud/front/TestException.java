package com.beizhi.cloud.front;

import com.beizhi.cloud.front.common.ExceptionEnums;
import com.beizhi.cloud.front.common.OpenServiceErrEnum;
import com.beizhi.cloud.front.common.ServiceException;

/**
 * Created by eric on 16/11/10.
 */
public class TestException {
    public static void main(String[] args) {
        try{
            throw new ServiceException(OpenServiceErrEnum.UNIQUE_KEY);
        }catch(ServiceException se){
            System.out.println(buildExceptionJSON(se));  //返回异常JSON
        }
    }

    private static  String buildExceptionJSON(ServiceException se){
            ExceptionEnums enums = se.getOpenServiceErrEnum();
            return  "{'code':"+ enums.getCode()+",'message':'"+enums.getMessage()+"'}";
    }
}
