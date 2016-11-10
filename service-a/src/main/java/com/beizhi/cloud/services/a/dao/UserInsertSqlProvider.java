package com.beizhi.cloud.services.a.dao;


import com.beizhi.cloud.services.a.model.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by kanghong.zhao on 2016-11-7.
 */
public class UserInsertSqlProvider {

    public String buildInsertSql(User user){
        return new SQL(){{
            INSERT_INTO("userinfo");
            VALUES("username", "#{username}");
            VALUES("password", "#{password}");
            if(user.getNameCn() != null && !"".equals(user.getNameCn().trim()))
                VALUES("name_cn", "#{nameCn}");
            if(user.getNameEn() != null && !"".equals(user.getNameEn().trim()))
                VALUES("name_en", "#{nameEn}");
        }}.toString();
    }

}
