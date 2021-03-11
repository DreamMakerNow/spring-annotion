package com.day01.dao;

import org.springframework.stereotype.Repository;

// DATE: 2021/3/6-17:14  Happy Every Day
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void out() {
        System.out.println("UserDao.Impl");
    }
}
