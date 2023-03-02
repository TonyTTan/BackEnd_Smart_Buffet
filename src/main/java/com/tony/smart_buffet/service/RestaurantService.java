package com.tony.smart_buffet.service;

import com.tony.smart_buffet.pojo.Restaurant;
import com.tony.smart_buffet.pojo.ResultBox.ResponseResult;

public interface RestaurantService {

    ResponseResult selectAllRestaurant();

    ResponseResult selectOneByIdRestaurant(int id);

    ResponseResult updateRestaurant(Restaurant restaurant);

    ResponseResult deleteByIdRestaurant(int id);

    ResponseResult insertRestaurant(Restaurant restaurant);

}
