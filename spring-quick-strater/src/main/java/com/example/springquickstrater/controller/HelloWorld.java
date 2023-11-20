package com.example.springquickstrater.controller;

import com.example.springquickstrater.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

//    @Value("${myuser.name}")
//    public String name;

    @Autowired
    private MyUser myUser;

    @RequestMapping("/hello")
    public String hello(){
        return myUser.getName();
    }
}
