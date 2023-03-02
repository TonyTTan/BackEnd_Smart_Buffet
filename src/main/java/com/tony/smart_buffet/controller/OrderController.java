package com.tony.smart_buffet.controller;

import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;
import com.tony.smart_buffet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public ResponseResult insertOrder(@RequestBody List<Map<String, Object>> list) {

        return orderService.insertOrder(list);
    }

}
