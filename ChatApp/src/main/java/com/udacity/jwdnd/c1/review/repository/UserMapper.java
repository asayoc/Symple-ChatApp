package com.udacity.jwdnd.c1.review.repository;

import com.udacity.jwdnd.c1.review.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM Users WHERE username = #{username}")
    User getUser(String username);

    @Insert("INSERT INTO Users (username, salt, password, firstname, lastname) " +
            "VALUES (#{username}, #{salt}, #{password}, #{firstname}, #{lastname})")
    @Options(useGeneratedKeys = true, keyProperty = "userid")
    int insert(User u);

}
