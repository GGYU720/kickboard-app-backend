package com.kickboardappbackend.mapper;

import com.kickboardappbackend.dto.UserInfoDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper
{
    UserInfoDto getUserInfo(@Param("user_no")String user_no);
}
