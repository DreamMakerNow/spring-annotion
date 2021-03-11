package com.day04.service;

// DATE: 2021/3/8-18:13  Happy Every Day

import com.day04.dao.UserDao;
import com.day04.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public void updateUser(Map map) {
        userDao.setUser(map);
    }
}
