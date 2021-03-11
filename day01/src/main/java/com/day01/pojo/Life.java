package com.day01.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// DATE: 2021/3/6-15:57  Happy Every Day
@Component
public class Life {

    @PostConstruct//初始化注解
    public void myInit(){
        System.out.println("初始化");
    }
    @PreDestroy//摧毁注解
    public void myDestory(){
        System.out.println("销毁");
    }
}
