package com.test.dao;

import com.test.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据id查询用户
    User getUserByid(int id);

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

}
