package com.resume.model;

/**
 * 工作经历实体类Work_info
 * 对应数据库中的work_info表
 *
 */
public class Work_info {
    private int Workid;//主键
    private String Company;//企业名
    private String Position;//职位
    private String Duty;//职责
    private String Departure;//离职时间
    private int Userid;//用户
    public int getWorkid() {
        return Workid;
    }
    public void setWorkid(int workid) {
        Workid = workid;
    }
    public String getCompany() {
        return Company;
    }
    public void setCompany(String company) {
        Company = company;
    }
    public String getPosition() {
        return Position;
    }
    public void setPosition(String position) {
        Position = position;
    }
    public String getDuty() {
        return Duty;
    }
    public void setDuty(String duty) {
        Duty = duty;
    }
    public String getDeparture() {
        return Departure;
    }
    public void setDeparture(String departure) {
        Departure = departure;
    }
    public int getUserid() {
        return Userid;
    }
    public void setUserid(int userid) {
        Userid = userid;
    }

    @Override
    public String toString() {
        return "Work_info{" +
                "Workid=" + Workid +
                ", Company='" + Company + '\'' +
                ", Position='" + Position + '\'' +
                ", Duty='" + Duty + '\'' +
                ", Departure='" + Departure + '\'' +
                ", Userid=" + Userid +
                '}';
    }
}