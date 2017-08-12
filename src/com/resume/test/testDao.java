package com.resume.test;

import com.resume.model.Basic_info;
import com.resume.model.User_info;
import com.resume.service.NewresumeService;
import com.resume.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    }
}
