package com.mars.user.service;

import com.mars.user.AbstractCommonTest;
import com.mars.user.dto.UserDTO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author ken
 * @Package com.mars.user.service
 * @Description:
 * @Date 2017/11/18 19:38
 */
public class UserServiceImplTest extends AbstractCommonTest {

    @Autowired
    UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertUser() throws Exception {
        System.err.println("==================>>>>");
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(12313231L);
        userDTO.setUserName("ken");
        userService.insertUser(userDTO);
    }

}