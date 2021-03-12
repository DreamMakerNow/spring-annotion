package com.day06.service;

// DATE: 2021/3/4-16:32  Happy Every Day



import com.day06.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> queryAllUser();
    User queryByName(String name);
    String queryPwd(String name);
}
