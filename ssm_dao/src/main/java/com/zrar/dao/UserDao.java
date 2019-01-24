package com.zrar.dao;

import com.sun.tools.javac.jvm.Items;
import com.zrar.pojo.User;

/**
 * @Description: 数据库查询接口
 * @Author: GT
 * @Version: 1.0
 */
public interface UserDao {
    public User findByName(String name);
}
