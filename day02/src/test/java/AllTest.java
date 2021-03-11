// DATE: 2021/3/7-15:52  Happy Every Day


import com.day02.application.AppConfig;
import com.day02.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.sql.Connection;

public class AllTest {
    @Test//用于测试：
    public void test1() {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

        User user = (User) ctx.getBean("user");
        System.out.println("user id = "+user.getId());
        System.out.println("user name = "+user.getName());
    }

    @Test//用于测试：
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Connection connection = (Connection) ctx.getBean("connection");
        System.out.println("connection = " + connection);
    }

    @Test//用于测试：
    public void test3() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) ctx.getBean("user");
        System.out.println("user id = "+user.getId());
        System.out.println("user name = "+user.getName());
    }

    @Test//用于测试：
    public void test4() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
