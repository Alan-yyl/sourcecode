package com.springboot.chapter3.pojo;

import org.springframework.stereotype.Service;

/**
 * @author yyl
 * @version 1.0
 * @date 2020/12/3 22:43
 */
@Service
public class UserService {
    public void printUser(User user){
        System.out.println("编号："+user.getId());
        System.out.println("用户名称："+user.getUserName());
        System.out.println("备注："+user.getNote());
    }
}
