package com.mars.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Package com.mars.user
 * @Description:
 * @Author ken
 * @Date 2017/11/11 4:04
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
