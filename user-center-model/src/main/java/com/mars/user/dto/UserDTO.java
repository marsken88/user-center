package com.mars.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Package com.mars.user.dto
 * @Description:
 * @author ken
 * @Date 2017/11/11 22:35
 */
@Data
@NoArgsConstructor
public class UserDTO implements Serializable {

    private Long userId;
    private String userName;
    private String userMobile;
    private String userThridId;
}
