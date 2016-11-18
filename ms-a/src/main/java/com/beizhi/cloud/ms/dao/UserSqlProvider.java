package com.beizhi.cloud.ms.dao;


import com.beizhi.cloud.ms.servicea.domain.TUser;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by kanghong.zhao on 2016-11-7.
 */
public class UserSqlProvider {

    public String buildInsertSql(TUser user){
        return new SQL(){{
            INSERT_INTO("t_user");
            VALUES("user_name", "#{userName}");
            VALUES("password", "#{password}");
            VALUES("sex",  "#{sex}");
            VALUES("born_at",  "#{bornAt}");
            if(user.getNameCn() != null && !"".equals(user.getNameCn().trim()))
                VALUES("name_cn", "#{nameCn}");
            if(user.getNameEn() != null && !"".equals(user.getNameEn().trim()))
                VALUES("name_en", "#{nameEn}");
        }}.toString();
    }

    public String buildUpdateSql(TUser user){
        return new SQL(){{
            UPDATE("t_user");
            if(StringUtils.isNotBlank(user.getUserName())){
                SET("user_name = #{userName}");
            }
            if(StringUtils.isNotBlank(user.getPassword())){
                SET("password = #{password}");
            }
            if(StringUtils.isNotBlank(user.getNameCn())){
                SET("name_cn = #{nameCn}");
            }
            if(StringUtils.isNotBlank(user.getNameEn())){
                SET("name_en = #{nameEn}");
            }

            if(StringUtils.isNotBlank(user.getBornAt().toString())){
                SET("born_at = #{bornAt}");
            }
            WHERE("id = #{id}");
        }}.toString();
    }

}
