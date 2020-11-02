package com.work.biz.entity;

import java.sql.Date;

public class Account {

    public String userId;
    public String userName;
    public String password;
    int isDeleted;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }


}
