package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定义Java配置文件
 * 加了Configuration注解，Spirng的容器会根据这个类配置Ioc容器去装配Bean
 * @author yyl
 * @version 1.0
 * @date 2020/12/3 19:25
 */
@Configuration
public class AppConfig {

    /**
     * 指定了name的值，将initUser方法返回的POJO装配到IoC容器中
     * @return
     */
    @Bean(name = "user")
    public User initUser(){
        User user = new User();
        // 1L表示1是长整型
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");

        return user;
    }

}
