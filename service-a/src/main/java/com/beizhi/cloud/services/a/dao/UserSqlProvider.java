package com.beizhi.cloud.services.a.dao;


import com.beizhi.cloud.services.a.model.User;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by kanghong.zhao on 2016-11-7.
 */
public class UserSqlProvider {

    public String buildInsertSql(User user){
        return new SQL(){{
            INSERT_INTO("t_user");
            VALUES("username", "#{username}");
            VALUES("password", "#{password}");
            if(user.getNameCn() != null && !"".equals(user.getNameCn().trim()))
                VALUES("name_cn", "#{nameCn}");
            if(user.getNameEn() != null && !"".equals(user.getNameEn().trim()))
                VALUES("name_en", "#{nameEn}");
        }}.toString();
    }

    public String buildUpdateSql(User user){
        return new SQL(){{
            UPDATE("t_user");
            if(StringUtils.isNotBlank(user.getUsername())){
                SET("username = #{username}");
            }
            if(StringUtils.isNotBlank(user.getNameCn())){
                SET("name_cn = #{nameCn}");
            }
            if(StringUtils.isNotBlank(user.getNameEn())){
                SET("name_en = #{nameEn}");
            }
            WHERE("id = #{id}");
        }}.toString();
    }

}
