package com.iweb.service;

import com.iweb.dao.UserDao;
import com.iweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("userService")  /*给service起一个名字 userService*/
public class UserServiceImpl implements UserService {

    //在service中使用dao的变量调用dao方法
    /*自动注入，把实现这个接口的对象注入给这个变量*/
    @Autowired
    UserDao userDao;

    @Override
    public User login(Map<String, Object> map) {
        return userDao.findbyLoginnameAndPassword(map);
    }
}
