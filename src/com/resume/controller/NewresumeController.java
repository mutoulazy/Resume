package com.resume.controller;

import com.resume.model.Basic_info;
import com.resume.model.Educational_info;
import com.resume.model.Work_info;
import com.resume.service.NewresumeService;
import com.resume.tools.WordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * NewresumeController类
 * 用于控制所有的操作简历的操作
 */

@Controller
public class NewresumeController {

    /*
     * spring自动扫描注入bean
     */
    @Autowired
    public NewresumeService newresumeservice;

    /*
     *用于插入用户输入的基本信息
     */
    @RequestMapping("/basic")
    /*
     * basicinfo:用于接收用户输入表单的数据
     * request:用于接收隐藏表单数据
     * session:传值
     */
    public String insertbasic(Basic_info basicinfo, HttpServletRequest request,
                              HttpSession session){
        String ret=null;
        //接收隐藏表单hidden的值
        int userid = Integer.parseInt(request.getParameter("Userid"));
        //将userid赋值给basicinfo的Userid
        basicinfo.setUserId(userid);
        session.setAttribute("loginuser", userid);
        try {
            //插入用户的基本信息
            newresumeservice.insertbasic(basicinfo);
            ret="Educational";
        } catch (Exception e) {
            System.out.println(e);
            ret ="error";
        }
        return ret;
    }

    /*
     * 用于插入用户输入的教育经历信息
     */

    @RequestMapping("/addEducational")
    /*
     * 三个参数的作用同上个方法
     */
    public String addEducational(Educational_info edu, HttpServletRequest request,
                                 HttpSession session){

        String ret=null;
        int userid = Integer.parseInt(request.getParameter("Userid"));
        edu.setUserid(userid);
        session.setAttribute("loginuser", userid);
        try {
            //添加教育信息，可以添加多次多条
            newresumeservice.addEducational(edu);
            ret="addEsuccess";
        } catch (Exception e) {
            System.out.println(e);
            ret ="error";
        }
        return ret;

    }
    /*
     * 用于插入用户输入的工作经历信息
     */

    @RequestMapping("/addWork")
    /*
     * 三个参数的作用同上
     */
    public String addWork(Work_info work, HttpServletRequest request,
                          HttpSession session){
        String ret=null;
        int userid = Integer.parseInt(request.getParameter("Userid"));
        work.setUserid(userid);
        session.setAttribute("loginuser", userid);
        try {
            //添加工作经验
            newresumeservice.addWork(work);
            ret="addWsuccess";
        } catch (Exception e) {
            System.out.println(e);
            ret ="error";
        }
        return ret;

    }
    /*
     * 用于插入用户自我介绍
     */

    @RequestMapping("/addIntroduce")
    /*
     * 由于用户的自我信息是在Basic_info表中，所以这里是update而不是insert
     */
    public String addIntroduce(Basic_info intro,HttpServletRequest request,
                               HttpSession session){

        String ret=null;
        int userid = Integer.parseInt(request.getParameter("Userid"));
        intro.setUserId(userid);
        session.setAttribute("loginuser", userid);
        try {
            //添加自我介绍信息
            newresumeservice.addIntroduce(intro);
            ret="addIsuccess";
        } catch (Exception e) {
            System.out.println(e);
            ret ="error";
        }
        return ret;

    }
    /*
     * 用于下载简历
     */

    @RequestMapping("/download")
    public String preview(HttpServletRequest request,
                          HttpSession session){

        String ret=null;
        //获取该用户的id
        int userid = Integer.parseInt(request.getParameter("Userid"));
        session.setAttribute("loginuser", userid);
        try {
            //查找基础信息
            List<Basic_info> basic_info = newresumeservice.selectBasic_info(userid);
            //查找教育信息
            List<Educational_info> educational_info = newresumeservice.selectEducational_info(userid);
            //查找工作信息
            List<Work_info> work_info = newresumeservice.selectWork_info(userid);
            //调用工具类，根据模板ftl文件生成word文档
            WordGenerator wordGenerator = new WordGenerator();
            wordGenerator.createDoc(basic_info, educational_info,work_info);
            ret="over";
        } catch (Exception e) {
            System.out.println(e);
            ret ="error";
        }
        return ret;


    }
}
