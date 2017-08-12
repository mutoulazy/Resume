package com.resume.model;

/**
 * 教育信息实体类Educational_info
 * 对应数据库中的educational_info表
 *
 */
public class Educational_info {
    private int Eduid;//主键
    private String School;//学校
    private String Major;//专业
    private String Education;//学历
    private String Graduation;//毕业时间
    private int Userid;//用户
    public int getEduid() {
        return Eduid;
    }
    public void setEduid(int eduid) {
        Eduid = eduid;
    }
    public String getSchool() {
        return School;
    }
    public void setSchool(String school) {
        School = school;
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor(String major) {
        Major = major;
    }
    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        Education = education;
    }
    public String getGraduation() {
        return Graduation;
    }
    public void setGraduation(String graduation) {
        Graduation = graduation;
    }
    public int getUserid() {
        return Userid;
    }
    public void setUserid(int userid) {
        Userid = userid;
    }

}
