package com.tony.smart_buffet.service.impl;

import com.tony.smart_buffet.mapper.MenuOrderMapper;
import com.tony.smart_buffet.mapper.OrderMapper;
import com.tony.smart_buffet.pojo.MenuOrder;
import com.tony.smart_buffet.pojo.Order;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;
import com.tony.smart_buffet.service.MessageService;
import com.tony.smart_buffet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;

    @Autowired
    private MenuOrderMapper menuOrderMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ResponseResult insertOrder(List<Map<String, Object>> list) {

        double totalPrice = 0.0;

        MenuOrder menuOrder = new MenuOrder();
        Order order = new Order();

        for (Map<String, Object> stringObjectMap : list) {

            String cId = stringObjectMap.get("cId").toString();
            menuOrder.setCId(Integer.parseInt(cId));

            menuOrder.setOId(stringObjectMap.get("oId").toString());

            String moNum = stringObjectMap.get("moNum").toString();
            menuOrder.setMoNum(Integer.parseInt(moNum));

            String moPrice = stringObjectMap.get("moPrice").toString();
            menuOrder.setMoPrice(Double.parseDouble(moPrice));

            totalPrice += menuOrder.getMoPrice() * Integer.parseInt(moNum);

        }
        System.out.println(totalPrice);

        order.setCId(menuOrder.getCId());
        order.setOId(menuOrder.getOId());
        order.setOTotalPrice(totalPrice);
        order.setOStatus(1);

        System.out.println(order);
        orderMapper.insert(order);

        for (Map<String, Object> stringObjectMap : list) {

            menuOrder.setOId(stringObjectMap.get("oId").toString());

            String mId = stringObjectMap.get("mId").toString();
            menuOrder.setMId(Integer.parseInt(mId));

            String cId = stringObjectMap.get("cId").toString();
            menuOrder.setCId(Integer.parseInt(cId));

            menuOrder.setMName(stringObjectMap.get("mName").toString());

            String moNum = stringObjectMap.get("moNum").toString();
            menuOrder.setMoNum(Integer.parseInt(moNum));

            String moPrice = stringObjectMap.get("moPrice").toString();
            menuOrder.setMoPrice(Double.parseDouble(moPrice));

            System.out.println(menuOrder);
            menuOrderMapper.insert(menuOrder);

        }

        System.out.println("??????????????????????????????");

        // ??????????????????
        messageService.sendMessage(menuOrder.getOId());

        System.out.println("??????????????????????????????");

        return new ResponseResult(200, "????????????????????????");
    }
}
