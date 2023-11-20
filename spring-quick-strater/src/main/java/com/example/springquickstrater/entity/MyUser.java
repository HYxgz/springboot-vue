package com.example.springquickstrater.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "myuser")
public class MyUser {
    private String name;
    private String sex;
    private String hobbies;
}
