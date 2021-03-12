package com.day06.service;

// DATE: 2021/3/4-16:31  Happy Every Day


import com.day06.dao.UserDao;
import com.day06.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public UserImpl() {
    }

    public UserImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public User queryByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public String queryPwd(String name) {
        return userDao.getPwd(name);
    }
}
