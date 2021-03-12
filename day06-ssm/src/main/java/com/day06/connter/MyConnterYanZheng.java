package com.day06.connter;

// DATE: 2021/3/4-16:34  Happy Every Day


import com.day06.pojo.User;
import com.day06.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyConnterYanZheng {
    @Autowired
    private UserService userService;
    @RequestMapping("/a3")
    public String ajax3(String name,String pwd){
        System.out.println("******************");
        User user = userService.queryByName(name);
        System.out.println(user+"******************");
//        System.out.println(user.getPwd()+"******************");
        String msg = "";
        //模拟数据库中存在数据
        if (name != null&&user!=null){
            msg = "OK";
        }else msg="用户名有误";
        if (pwd!=null&&user!=null){
            if (user.getPwd().equals(pwd)){
                System.out.println("***********************"+pwd);
                msg = "OK";
            }else {
                System.out.println(user.getPwd()+"**********");
                msg = "密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}
