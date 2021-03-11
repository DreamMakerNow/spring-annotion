// DATE: 2021/3/8-15:18  Happy Every Day

import AppConfigs.AppConfig1;
import AppConfigs.AppConfig2;
import AppConfigs.Appconfigs;
import com.day03.aop.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import pojo.User;
import service.UserService;

public class Day03 {
    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfigs.class);
//        User user = (User) ctx.getBean("user");
//        System.out.println(user);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
//        System.out.println(ctx.getBean("person"));
    }

    @Test//用于测试：
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfigs.class);
        UserService userService = (UserService) ctx.getBean("userService");
        userService.out();
    }

    @Test//用于测试：注解版 aop
    public void test3() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        com.day03.aop.UserService userServiceImpl = (com.day03.aop.UserService) ctx.getBean("userServiceImpl");
        userServiceImpl.input();
        userServiceImpl.output();
    }
}
