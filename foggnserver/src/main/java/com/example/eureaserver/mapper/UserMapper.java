package com.example.eureaserver.mapper;

import com.example.eureaserver.entity.UserEO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 用户中的增删改查
 */
@Mapper
@Repository
public interface UserMapper{
    /**
     * @param userId
     * @return
     */
//    @Select("SELECT * from sys_user WHERE user_id = #{userId}")
//    @Results({
//            @Result(property = "userId", column = "user_id"),
//            @Result(property = "userName", column = "user_name"),
//            @Result(property = "passWorld", column = "passworld")
//    })
    UserEO findById(@Param("userId") Integer userId);

    /**
     * @param user
     */
    void insertUser(UserEO user);

    /**
     * @param user
     */
    void updateUser(@Param("user") UserEO user);

    /**
     * @param userId
     */
    void delUser(@Param("usrId") Integer userId);
}
