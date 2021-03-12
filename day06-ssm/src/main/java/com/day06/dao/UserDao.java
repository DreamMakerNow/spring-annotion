package com.day06.dao;

// DATE: 2021/3/10-9:19  Happy Every Day

import com.day06.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> selectAllUser();
}
