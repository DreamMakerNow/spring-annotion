package com.day01.service;

// DATE: 2021/3/6-17:15  Happy Every Day

import com.day01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
    @Autowired 注入用户自定义类型数据(根据类的类型来注入)
    @Qualifier("userDaoImpl") 配合@Autowired 使用名字来注入相应类型的 bean

     @Resource(name="userDaoImpl") 通过名字来注入，如果不写名字，默认使用类型注入，
 */
@Service
public class UserServiceImpl implements UserService{
//    @Autowired
//    @Qualifier("userDaoImpl")
    @Resource(name="userDaoImpl")
    private UserDao userDao;
    @Override
    public void output() {
        System.out.println("UserService.Impl");
        userDao.out();
    }
}
