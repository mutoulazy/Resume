package com.resume.model;

/**
 * Basic_info实体类
 * 对应数据库中的basic_info表
 * 简历的基本信息实体类
 */
public class Basic_info {

    private int ID;//主键，ID
    private String Name;//姓名
    private String Gender;//性别
    private int Age;//年龄
    private String Address;//地址
    private String Email;//邮件
    private String Tel;//电话
    private String School;//毕业院校
    private String Introduce;//自我介绍
    private int UserId;//用户ID
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getTel() {
        return Tel;
    }
    public void setTel(String tel) {
        Tel = tel;
    }
    public String getSchool() {
        return School;
    }
    public void setSchool(String school) {
        School = school;
    }
    public String getIntroduce() {
        return Introduce;
    }
    public void setIntroduce(String introduce) {
        Introduce = introduce;
    }
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        this.UserId = userId;
    }

    @Override
    public String toString() {
        return "Basic_info{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel='" + Tel + '\'' +
                ", School='" + School + '\'' +
                ", Introduce='" + Introduce + '\'' +
                ", UserId=" + UserId +
                '}';
    }
}
