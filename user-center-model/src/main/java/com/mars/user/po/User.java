package com.mars.user.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ken
 * @Package com.mars.user.po
 * @Description:
 * @Date 2017/11/17 23:18
 */
@Data
@NoArgsConstructor
public class User implements Serializable{
    private Long userId;
    private String userName;
    private String userMobile;
    private String userThridId;

}
