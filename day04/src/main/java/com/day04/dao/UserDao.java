package com.day04.dao;

// DATE: 2021/3/8-17:19  Happy Every Day

import com.day04.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> selectAllUser();
    void setUser(Map map);
}
