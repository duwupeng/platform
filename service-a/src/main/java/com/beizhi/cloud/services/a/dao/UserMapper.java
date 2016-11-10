package com.beizhi.cloud.services.a.dao;

import com.beizhi.cloud.services.a.model.User;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kanghong.zhao on 2016-11-10.
 */
public interface UserMapper {

    @Select("select * from user where id = #{userId}")
    User getById(Integer userId);

    @InsertProvider(type = UserInsertSqlProvider.class, method = "buildInsertSql")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(User userinfo);
}
