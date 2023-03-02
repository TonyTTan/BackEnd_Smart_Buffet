package com.tony.smart_buffet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tony.smart_buffet.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
