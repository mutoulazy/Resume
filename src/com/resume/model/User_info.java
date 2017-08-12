package com.resume.model;

/**
 * User_info实体类
 * 对应数据库中的user_info表
 * 用户登录信息实体类
 */
public class User_info {
    private int userid;//用户id，主键

    private String  Name;//登录名

    private String Password;//登录密码

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User_info{" +
                "userid=" + userid +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}