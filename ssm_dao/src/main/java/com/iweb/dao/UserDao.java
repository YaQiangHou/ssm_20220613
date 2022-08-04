package com.iweb.dao;

import com.iweb.model.User;

import java.util.Map;

public interface UserDao {

    //根据用户名和密码查询用户的信息
    User findbyLoginnameAndPassword(Map<String,Object> map);
}
