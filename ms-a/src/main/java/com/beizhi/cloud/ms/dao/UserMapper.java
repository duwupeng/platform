package com.beizhi.cloud.ms.dao;

import com.beizhi.cloud.ms.servicea.domain.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by kanghong.zhao on 2016-11-10.
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{userId}")
    TUser getById(Integer userId);

    @InsertProvider(type = UserSqlProvider.class, method = "buildInsertSql")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(TUser user);

    @Select("select * from t_user ")
    List<TUser> findAll();

    @UpdateProvider(type = UserSqlProvider.class, method = "buildUpdateSql")
    Integer update(TUser user);

    @Delete("delete from t_user where id = #{userId}")
    Integer delete(Integer userId);
}
