package com.kickboardappbackend.service;

import com.kickboardappbackend.dto.UserInfoDto;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public UserInfoDto getUserInfo(@Param("user_no")String user_no);
}
