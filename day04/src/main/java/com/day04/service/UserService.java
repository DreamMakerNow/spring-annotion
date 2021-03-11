package com.day04.service;

// DATE: 2021/3/8-18:13  Happy Every Day

import com.day04.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> queryAllUser();
    void updateUser(Map map);
}
