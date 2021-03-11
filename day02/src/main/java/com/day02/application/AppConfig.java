package com.day02.application;

//import com.day02.pojo.User;
import com.day02.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DATE: 2021/3/7-15:50  Happy Every Day
/*
        配置类的优先级别
        标签  > @Bean >  @Component
        级别高的会覆盖级别低的（前提是 id 值需要一样）
 */

@Configuration //取代了applicationContext.xml
@PropertySource(value = "classpath:/user.properties",encoding = "utf-8")
@ComponentScan(basePackages = "com.day02.pojo",excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION, value = {Component.class})})
public class AppConfig {
    @Value("${id}")
    private Integer id;
    @Value("${name}")
    private String name;
    /*
        简单对象的创建
     */
    @Bean
//    @Scope("prototype")
    public User user(){
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
    /*
        复杂对象的创建
     */
    @Bean("conn")//自定义 ID 值
    public Connection connection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true","root","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return connection;
    }
}
