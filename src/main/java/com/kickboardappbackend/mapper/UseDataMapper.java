package com.kickboardappbackend.mapper;

import com.kickboardappbackend.dto.UseDataDto;
import com.kickboardappbackend.dto.UsedListDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseDataMapper {

    UseDataDto getUseData(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

    List<UsedListDto> getUsedList(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

}
