package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.*;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;


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
public class AppConfig {

    /**
     * 指定了name的值，将initUser方法返回的POJO装配到IoC容器中
     * @return
     */
    @Bean("user")
    public User initUser(){
        User user = new User();
        // 1L表示1是长整型
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");

        return user;
    }


    /**
     * @Bean注解实现将getDataSource()方法的返回值注入到IoC容器中
     * @return
     */
    @Bean("dataSource")
    public DataSource getDataSource(){
        Properties props = new Properties();

        props.setProperty("driver","com.mysql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/chapter3");
        props.setProperty("username","root");
        props.setProperty("password","123456");

        DataSource dataSource=null;

        try {
            dataSource= BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataSource;
    }

}
