package com.example.sbmpsqlite.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User {

    @TableId
    @TableField("user_id")
    private String userId;

    @TableField("user_password")
    private String userPassword;

    @TableField("user_register_time")
    private String userRegisterTime;

    @TableField("user_latest_login_time")
    private String userLatestLoginTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getUserLatestLoginTime() {
        return userLatestLoginTime;
    }

    public void setUserLatestLoginTime(String userLatestLoginTime) {
        this.userLatestLoginTime = userLatestLoginTime;
    }
}
