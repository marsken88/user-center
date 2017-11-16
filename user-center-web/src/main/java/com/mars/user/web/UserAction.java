package com.mars.user.web;

import com.mars.user.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Package com.mars.user.web
 * @Description:
 * @author ken
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
    public String getUsers(UserDTO userDTO) {
        return "123123";
    }

    @PutMapping
    public String updateUser(UserDTO userDTO) {
        return "ok";
    }

    @PostMapping
    public String createUser(UserDTO userDTO) {
        return "ok";
    }

    @DeleteMapping(value = "/{id}")
    public String deleteUser(@PathVariable(name = "id") String id) {
        return "ok";
    }
}
