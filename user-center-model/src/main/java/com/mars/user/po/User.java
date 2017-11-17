package com.mars.user.po;

import java.io.Serializable;

/**
 * @author ken
 * @Package com.mars.user.po
 * @Description:
 * @Date 2017/11/17 23:18
 */
public class User implements Serializable{
    private Long userId;
    private String userName;
    private String userMobile;
    private String userThridId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserThridId() {
        return userThridId;
    }

    public void setUserThridId(String userThridId) {
        this.userThridId = userThridId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userThridId='" + userThridId + '\'' +
                '}';
    }
}
