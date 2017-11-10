package com.mars.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.mars.user.web
 * @Description:
 * @Author ken
 * @Date 2017/11/11 4:07
 */
@RestController
@RequestMapping(value = "/users")
public class UserAction {
    @GetMapping(value = "/{id}")
    public String getUserById(@PathVariable(name = "id") String id) {

        return "ok";
    }

    @GetMapping
    public String getUsers() {
        return "123123";
    }
}
