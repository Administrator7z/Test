package com.xxx.pojo;

public class Users {
    private Integer userId;
    private String uName;
    private String uPass;

    public Users() {
    }

    public Users(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public Users(Integer userId, String uName, String uPass) {
        this.userId = userId;
        this.uName = uName;
        this.uPass = uPass;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", uName='" + uName + '\'' +
                ", uPass='" + uPass + '\'' +
                '}';
    }
}
