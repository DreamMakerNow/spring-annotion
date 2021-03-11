package com.day06.dao;

// DATE: 2021/3/10-9:19  Happy Every Day

import com.day06.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
}
