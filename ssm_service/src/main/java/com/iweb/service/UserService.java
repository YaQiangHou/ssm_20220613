package com.iweb.service;

import com.iweb.model.User;

import java.util.Map;

public interface UserService {

    /*判断用户是否登录*/
    public User login(Map<String,Object> map);

}
