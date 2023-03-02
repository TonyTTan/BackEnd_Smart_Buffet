package com.tony.smart_buffet.service;

import com.tony.smart_buffet.pojo.History;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;

import java.util.List;

public interface HistoryService {

    List<String> selectOneByIdHistory(String cId);

    ResponseResult insertHistory(History history);

}
