package com.day03.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// DATE: 2021/3/8-16:46  Happy Every Day
@Configuration
@ComponentScan(basePackages = "com.day03.aop")
@EnableAspectJAutoProxy(proxyTargetClass = false)//proxyTargetClass = true使用cglib方式创建对象 ，默认false 使用jdk
public class AppConfig {
}
