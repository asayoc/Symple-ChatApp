package com.udacity.jwdnd.c1.review.repository;

import com.udacity.jwdnd.c1.review.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM Messages ORDER BY messageid ASC")
    List<ChatMessage> getMessages();

    @Insert("INSERT INTO Messages (username, messagetext)" +
            "VALUES (#{username}, #{messagetext})")
    void insert(String username, String messagetext);


}
