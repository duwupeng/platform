package com.beizhi.cloud.base.servicea.dao;

import com.beizhi.cloud.base.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by kanghong.zhao on 2016-11-10.
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{userId}")
    User getById(Integer userId);

    @InsertProvider(type = UserSqlProvider.class, method = "buildInsertSql")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(User user);

    @Select("select * from t_user ")
    List<User> findAll();

    @UpdateProvider(type = UserSqlProvider.class, method = "buildUpdateSql")
    Integer update(User user);

    @Delete("delete from t_user where id = #{userId}")
    Integer delete(Integer userId);
}
