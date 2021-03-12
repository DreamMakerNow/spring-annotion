package day06Test;

// DATE: 2021/3/10-8:57  Happy Every Day

import com.day06.appconfig.Appconfig1;
import com.day06.dao.BlogDao;
import com.day06.dao.UserDao;
import com.day06.pojo.Blog;
import com.day06.pojo.User;
import com.day06.service.BlogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.List;

public class ssmTest {
    @Test
    public void tset(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig1.class);
        BlogDao blog = (BlogDao) ctx.getBean("blogDao");
        List<Blog> blogs = blog.selectAllblog();
        for (Blog blog1 : blogs) {
            System.out.println(blog1);
        }
    }

    @Test//用于测试：
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig1.class);
        UserDao user =(UserDao) ctx.getBean("userDao");
//        List<User> users = user.selectAllUser();
//        for (User user1 : users) {
//            System.out.println(user1);
//        }
        String pwd = user.getPwd("范蹦");
        System.out.println(user.getUserByName("范蹦"));
        System.out.println("pwd = " + pwd);
    }

    @Test//用于测试：
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig1.class);
        BlogService blogService = (BlogService) ctx.getBean("blogServiceImpl");
        List<Blog> blogs = blogService.queryBlog();
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}
