package com.tony.smart_buffet.service;

import com.tony.smart_buffet.pojo.Feedback;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;

public interface FeedbackService {

    ResponseResult selectAllFeedback();

    ResponseResult selectOneByIdFeedback(int id);

    ResponseResult updateFeedback(Feedback feedback);

    ResponseResult deleteByIdFeedback(int id);

    ResponseResult insertFeedback(Feedback feedback);

}
