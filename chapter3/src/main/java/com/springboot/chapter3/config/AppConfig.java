package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


/**
 * 定义Java配置文件
 * 加了Configuration注解，Spirng的容器会根据这个类配置Ioc容器去装配Bean
 * @ComponentScan("com.springboot.chapter3.*"):
 * @ComponentScan(basePackages = {"com.springboot.chapter3.pojo"})
 * @ComponentScan(basePackageClasses = {User.class})
 * @author yyl
 * @version 1.0
 * @date 2020/12/3 19:25
 */
@Configuration
@ComponentScan(basePackages = "com.springboot.chapter3.*",excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class AppConfig {

    /**
     * 指定了name的值，将initUser方法返回的POJO装配到IoC容器中
     * @return
     */
    public User initUser(){
        User user = new User();
        // 1L表示1是长整型
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");

        return user;
    }

}
