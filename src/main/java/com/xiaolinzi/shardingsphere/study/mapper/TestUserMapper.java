package com.xiaolinzi.shardingsphere.study.mapper;


import com.xiaolinzi.shardingsphere.study.entity.TestUser02;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestUserMapper {
    @Results(id="selectAll",
            value = {
                    @Result(property = "id", column = "ID", id = true),
                    @Result(property = "userName", column = "USER_NAME"),
                    @Result(property = "userId", column = "USER_ID")})
    @Select("SELECT * FROM test_user")
    List<TestUser02> selectAll();

    @Results(id="selectById",
            value = {
                    @Result(property = "id", column = "ID", id = true),
                    @Result(property = "userName", column = "USER_NAME"),
                    @Result(property = "userId", column = "USER_ID")})
    @Select("SELECT * FROM test_user02 t where t.id = #{id}")
    TestUser02 selectById(@Param("id") Integer id);




}