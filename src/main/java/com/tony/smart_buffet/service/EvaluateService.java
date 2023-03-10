package com.tony.smart_buffet.service;

import com.tony.smart_buffet.pojo.Evaluate;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;

public interface EvaluateService {

    ResponseResult selectAllEvaluate();

    ResponseResult selectOneByIdEvaluate(int id);

    ResponseResult updateEvaluate(Evaluate evaluate);

    ResponseResult deleteByIdEvaluate(int id);

    ResponseResult insertEvaluate(Evaluate evaluate);

}
