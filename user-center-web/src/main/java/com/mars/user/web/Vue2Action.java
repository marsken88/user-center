package com.mars.user.web;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ken
 * @Package com.mars.user.web
 * @Description:
 * @Date 2018/01/11 20:58
 */
@RestController
@RequestMapping(value = "/vue2")
public class Vue2Action {
    @GetMapping(value = "/hello")
    public String helloVue(){
        String result = "{ \"name\": \"helloVue2\", \"age\": \"xxx\"}";

        return result;
    }
}
