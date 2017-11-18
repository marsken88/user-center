package com.mars.user.service;

import com.mars.user.dto.UserDTO;
import com.mars.user.po.User;

/**
 * @author ken
 * @Package com.mars.user.service
 * @Description:
 * @Date 2017/11/18 18:55
 */
public interface UserService {

    /**
     * 新增用户
     *
     * @param userDTO
     */
    void insertUser(UserDTO userDTO);

}
