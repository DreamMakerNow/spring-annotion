package Test;

import com.day01.pojo.User;
import com.day01.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

// DATE: 2021/3/6-15:24  Happy Every Day
public class AllTest {

    @Test
    public void test1(){//测试 @Component
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        System.out.println("user id = "+user.getId());//验证 xml 文件覆盖 @Component xml文件中也写一个 id=user 的 bean 注入 id
    }
    @Test
    public void test2(){//测试 @Scope
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = applicationContext.getBean("user", User.class);
        User user2 = applicationContext.getBean("user", User.class);
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
    @Test
    public void test3(){//测试 @Lazy
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("user", User.class); //写完这句才会创建工厂对象
    }
    @Test
    public void test4(){//测试 生命周期的注解
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        applicationContext.close();
    }
    @Test
    public void test5(){//测试 @Autowired
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.output();
        applicationContext.close();
    }
    @Test
    public void test6(){//测试 @Value
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("user id = "+user.getId());
        System.out.println("user name = "+user.getName());
        applicationContext.close();
    }
    @Test
    public void test7(){//测试 @Value
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println("user id = "+user.getId());
        System.out.println("user name = "+user.getName());
        applicationContext.close();
    }

    @Test//用于测试：排除和包含 扫描
    public void test8() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
