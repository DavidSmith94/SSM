package com.zrar.service.impl;

import com.zrar.dao.UserDao;
import com.zrar.pojo.User;
import com.zrar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户服务接口实现类
 * @Author: GT
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
