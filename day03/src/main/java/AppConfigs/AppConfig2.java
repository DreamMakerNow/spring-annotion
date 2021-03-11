package AppConfigs;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.Person;
import service.UserService;
import service.UserServiceImpl;

// DATE: 2021/3/8-15:14  Happy Every Day
@Configuration
public class AppConfig2 {
    @Bean
    public Person person(){
        return new Person();
    }

}
