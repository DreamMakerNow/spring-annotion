package AppConfigs;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import service.UserService;
import service.UserServiceImpl;

// DATE: 2021/3/8-15:24  Happy Every Day
@Configuration
@Import({AppConfig1.class,AppConfig2.class})
public class Appconfigs {
    @Autowired
    private UserDao userDao;
    @Bean
    public UserService userService(){
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(userDao);
        return userServiceImpl;
    }
}
