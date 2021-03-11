package com.day01.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// DATE: 2021/3/6-15:17  Happy Every Day

@Component  //取代了 <bean class="com.day01.pojo.User" id="user"/>
//默认 id 对象类首单词首字母小写
//若 需要自定义 id 只需在 @Component 加入指定字符即可 例如：@Component("u") User这个类的 id 就是 “u"
//xml文件如果指定了相同 id 的 bean 标签 会对 @Component 进行覆盖
/*
    衍生注解
        @Repository 用在 Dao 接口
        @Service 用在service类
        @Controller 用在web项目中的控制类
            以上三种使用的方法及规则都和 @Component 一样
            上面使用的地方都可以使用 @Component
*/
@Scope("singleton")//默认值，只创建一个对象
//@Scope("prototype")//创建多个对象
@Lazy//单例模式中的懒汉式，使用时才会创建对象
@PropertySource(value = "classpath:/user.properties",encoding = "utf-8") // 取代了<context:property-placeholder location="classpath:/user.properties" file-encoding="utf-8"/>
/*
    @PropertySource 不能注入复杂数据类型，比如 集合，数组等
    后面会使用 springboot中的 YAML/YML 注入
 */
public class User {
    @Value("${id}")
    private Integer id;
    @Value("${name}")
    private String name;
    private String pwd;

    public User() {
        System.out.println("工厂类创建");
    }

    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", pwd='" + pwd + '\'' +
//                '}';
//    }
}
