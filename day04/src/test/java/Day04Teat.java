// DATE: 2021/3/8-17:42  Happy Every Day

import com.day04.appConfig.AppConfig;
import com.day04.dao.UserDao;
import com.day04.pojo.User;
import com.day04.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class Day04Teat {
    @Test
    public void test1(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDao user = (UserDao) ctx.getBean("userDao");
        List<User> users = user.selectAllUser();
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test//用于测试：
    public void test2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) ctx.getBean("userServiceImpl");
        List<User> users = userService.queryAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test//用于测试：
    public void test3() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = (UserService) ctx.getBean("userServiceImpl");
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",5);
        map.put("name","国林");
        map .put("pwd","147258");
        userService.updateUser(map);
    }
}
