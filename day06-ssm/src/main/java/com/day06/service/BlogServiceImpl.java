package com.day06.service;

// DATE: 2021/3/12-9:36  Happy Every Day

import com.day06.dao.BlogDao;
import com.day06.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogDao blogDao;

    public BlogServiceImpl() {
    }

    public BlogServiceImpl(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public BlogDao getBlogDao() {
        return blogDao;
    }

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    @Override
    public List<Blog> queryBlog() {
        return blogDao.selectAllblog();
    }
}
