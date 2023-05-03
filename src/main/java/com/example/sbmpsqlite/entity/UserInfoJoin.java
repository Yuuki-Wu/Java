package com.example.sbmpsqlite.entity;

public class UserInfoJoin {
    private String userId;
    private String weight;
    private String height;
    private String userRegisterTime;
    private String info;
    private Integer state;
    private String img;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(String userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
