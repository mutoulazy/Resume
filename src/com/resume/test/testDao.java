package com.resume.test;

import com.resume.model.Basic_info;
import com.resume.model.Educational_info;
import com.resume.model.User_info;
import com.resume.model.Work_info;
import com.resume.service.NewresumeService;
import com.resume.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by mutoulazy on 2017/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testDao {
    @Autowired
    UserService userService;

    @Autowired
    NewresumeService newresumeService;

    @Test
    public void testUserDao(){
        User_info admin = userService.login("admin");
        System.out.println(admin);
    }

    @Test
    public void testNewresumeInsertBasic(){
        Basic_info basic_infoa = new Basic_info();
        basic_infoa.setAddress("Address");
        basic_infoa.setAge(21);
        basic_infoa.setEmail("123@213.com");
        basic_infoa.setGender("gender");
        basic_infoa.setID(1);
        basic_infoa.setIntroduce("admin");
        basic_infoa.setName("admin");
        basic_infoa.setTel("110");
        basic_infoa.setSchool("ccsu");
        basic_infoa.setUserId(1);

        newresumeService.insertbasic(basic_infoa);
    }

    @Test
    public void testNewresumeAddEdu(){
        Educational_info educational_info = new Educational_info();
        educational_info.setEducation("education");
        educational_info.setEduid(1);
        educational_info.setGraduation("graduation");
        educational_info.setMajor("soft");
        educational_info.setSchool("ccsu");
        educational_info.setUserid(1);

        newresumeService.addEducational(educational_info);
    }

    @Test
    public void testNewresumeAddWork(){
        Work_info work_info = new Work_info();
        work_info.setCompany("ccs");
        work_info.setDeparture("Departure");
        work_info.setDuty("duty");
        work_info.setPosition("position");
        work_info.setWorkid(1);
        work_info.setUserid(1);

        newresumeService.addWork(work_info);
    }

    @Test
    public void testNewresumeAddIn(){
        Basic_info basic_infoa = new Basic_info();
        basic_infoa.setAddress("Address");
        basic_infoa.setAge(21);
        basic_infoa.setEmail("123@213.com");
        basic_infoa.setGender("gender");
        basic_infoa.setID(1);
        basic_infoa.setIntroduce("admin");
        basic_infoa.setName("admin");
        basic_infoa.setTel("110");
        basic_infoa.setSchool("ccsu");
        basic_infoa.setUserId(1);

        newresumeService.addIntroduce(basic_infoa);
    }

    @Test
    public void testNewresumeSelect(){
        List<Basic_info> basic_infoList = newresumeService.selectBasic_info(1);
        List<Educational_info> educational_infoList = newresumeService.selectEducational_info(1);
        List<Work_info> work_infoList = newresumeService.selectWork_info(1);

        System.out.println(basic_infoList.toString() + educational_infoList.toString() + work_infoList.toString());
    }
}
