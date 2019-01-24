package com.zrar.service;

import com.zrar.pojo.User;

/**
 * @Description: 用户服务接口
 * @Author: GT
 * @Version: 1.0
 */
public interface UserService {
    public User findByName(String name);
}
