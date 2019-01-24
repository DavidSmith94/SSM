package com.zrar.controller;

import com.zrar.pojo.User;
import com.zrar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用户表访问控制层
 * @Author: GT
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find.do")
    public User findByName(String name){
        User user = userService.findByName("gt");
        System.out.println(user);
        return user;
    }

    @RequestMapping("/test.do")
    public Map Test(String name){
        HashMap map = new HashMap();
        map.put("name","jack");
        map.put("age",24);
        return map;
    }

}
