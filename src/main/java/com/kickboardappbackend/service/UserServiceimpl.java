package com.kickboardappbackend.service;

import com.kickboardappbackend.dto.UserInfoDto;
import com.kickboardappbackend.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService {
    @Autowired
    private final UserMapper userMapper;
    
	@Override
	public UserInfoDto getUserInfo(String user_no){

        UserInfoDto result = userMapper.getUserInfo(user_no);
        
		return result;
	}
}
