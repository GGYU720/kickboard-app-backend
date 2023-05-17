package com.kickboardappbackend.service;

import com.kickboardappbackend.dto.UseDataDto;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.Objects;

public interface UseDataService {

    public UseDataDto getUseData(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

    public Map<String, Object> getUsedList(@Param("user_no")String user_no, @Param("start_dt")String start_dt);
}
