// DATE: 2021/3/9-13:47  Happy Every Day

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import yaml.AppConfigYaml;
import yaml.User;

import java.util.List;

public class day05Test {
    @Test
    public void test(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigYaml.class);
        User user = (User) ctx.getBean("user");
        System.out.println("user.getId() = " + user.getId());
        System.out.println("user.getName() = " + user.getName());
        List list = user.getXh();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
