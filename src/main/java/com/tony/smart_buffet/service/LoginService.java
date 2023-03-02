package com.tony.smart_buffet.service;

import com.tony.smart_buffet.pojo.Comsumer;
import com.tony.smart_buffet.pojo.Manager;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;

public interface LoginService {
    ResponseResult loginComsumer(Comsumer comsumer);

    ResponseResult loginManager(Manager manager);

    ResponseResult logoutConsumer();

    ResponseResult logoutManager();
}
