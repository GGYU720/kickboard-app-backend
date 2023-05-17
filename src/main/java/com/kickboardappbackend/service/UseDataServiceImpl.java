package com.kickboardappbackend.service;

import com.kickboardappbackend.dto.UseDataDto;
import com.kickboardappbackend.dto.UsedListDto;
import com.kickboardappbackend.mapper.UseDataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UseDataServiceImpl implements UseDataService {

    @Autowired
    private final UseDataMapper useDataMapper;

    @Override
    public UseDataDto getUseData(String user_no, String start_dt) {

        UseDataDto result = useDataMapper.getUseData(user_no, start_dt);

        return result;
    }

    @Override
    public Map<String, Object> getUsedList(String user_no, String start_dt) {
        List<UsedListDto> list = useDataMapper.getUsedList(user_no, start_dt);


        Map<String, Object> result = new HashMap<>();
        result.put("list", list);

        return result;
    }
}
