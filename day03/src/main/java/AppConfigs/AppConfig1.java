package AppConfigs;

import dao.UserDao;
import dao.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.User;

// DATE: 2021/3/8-15:14  Happy Every Day
@Configuration
@ComponentScan(basePackages = "service")
public class AppConfig1 {
    @Bean
    public User user(){
        return new User();
    }
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDaoImpl();
        return userDao;
    }
}
