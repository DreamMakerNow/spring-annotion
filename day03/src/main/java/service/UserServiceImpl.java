package service;

import dao.UserDao;
import org.springframework.stereotype.Service;

// DATE: 2021/3/8-15:14  Happy Every Day
@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;


    @Override
    public void out() {
        System.out.println("UserService.Impl");
        userDao.save();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
