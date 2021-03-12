package com.day06.connter;

import com.day06.pojo.Blog;
import com.day06.service.BlogService;
import com.day06.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// DATE: 2021/3/12-9:34  Happy Every Day
@Controller
public class MyConnter {
    @Autowired
    private BlogService blogService;
    @RequestMapping("/test")
    public String test(Model model){
        System.out.println("*********************8");
        List<Blog> blogs = blogService.queryBlog();
        model.addAttribute("list",blogs);
        return "test";
    }
    @RequestMapping("/lg")
    public String login(){
        return "test";
    }
}
