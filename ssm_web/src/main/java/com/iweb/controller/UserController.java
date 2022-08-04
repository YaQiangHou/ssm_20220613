package com.iweb.controller;

import com.iweb.model.User;
import com.iweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userService") /*只能把叫userService的service注入到这个接口变量*/
    UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView mv, HttpSession session, @RequestParam String loginname, @RequestParam String password){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("loginname",loginname);
        map.put("password",password);
        User user =userService.login(map);
        if(user != null){
            /*欢迎信息（登陆名），通常放到session中*/
            session.setAttribute("user",user);
            mv.setViewName("forward:/main");
        }else{
            /*modelview用来返回信息和页面跳转*/
            mv.addObject("message","对不起，用户名或密码错误");
            mv.setViewName("login");
        }
        return mv;
    }
}
