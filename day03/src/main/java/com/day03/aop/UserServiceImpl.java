package com.day03.aop;

import org.springframework.stereotype.Service;

// DATE: 2021/3/8-16:46  Happy Every Day
@Service
public class UserServiceImpl implements UserService{
    @Override
    public void input() {
        System.out.println("input");
    }

    @Override
    public void output() {
        System.out.println("output");
    }
}
