package com.mars.user.service;

import com.mars.user.dto.UserDTO;
import com.mars.user.mapper.UserMapper;
import com.mars.user.po.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ken
 * @Package com.mars.user.service
 * @Description:
 * @Date 2017/11/18 0:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        System.err.println(user);
        userMapper.insert(user);
    }

    @Override
    public void removeUser(Long userId) {
        userMapper.remove(userId);
    }

    @Override
    public List<UserDTO> getUsers() {
        List<User> users = userMapper.getUsers();
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users) {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user, userDTO);
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }
}
