package yaml;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

// DATE: 2021/3/9-13:09  Happy Every Day
@Configuration
@ComponentScan(basePackages = "yaml")
public class AppConfigYaml {
    @Bean
    public PropertySourcesPlaceholderConfigurer configurer(){
//        E:/java/Spring-Annotation/day04/src/main/resources/
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        yamlPropertiesFactoryBean.setResources(new ClassPathResource("init.yml"));
        Properties properties = yamlPropertiesFactoryBean.getObject();
        assert properties != null;
        configurer.setProperties(properties);
        return configurer;
    }
}
