package com.resume.service;

import com.resume.mapper.NewresumeMapper;
import com.resume.model.Basic_info;
import com.resume.model.Educational_info;
import com.resume.model.Work_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 将当前类注释为一个 Spring 的 bean
 **/
@Service
@Transactional
public class NewresumeServiceImpl implements NewresumeService{
    //通过自动扫描注入Bean
    @Autowired
    public NewresumeMapper newresumeMapper;
    //重写方法
    @Override
    public void insertbasic(Basic_info basicinfo) {
        newresumeMapper.insertbasic(basicinfo);
    }
    @Override
    public void addEducational(Educational_info edu) {
        newresumeMapper.addEducational(edu);

    }
    @Override
    public void addWork(Work_info work) {
        newresumeMapper.addWork(work);

    }
    @Override
    public void addIntroduce(Basic_info intro) {
        newresumeMapper.addIntroduce(intro);

    }
    @Override
    public List<Basic_info> selectBasic_info(int userid) {
        return newresumeMapper.selectBasic_info(userid);
    }
    @Override
    public List<Educational_info> selectEducational_info(int userid) {
        return newresumeMapper.selectEducational_info(userid);
    }
    @Override
    public List<Work_info> selectWork_info(int userid) {
        return newresumeMapper.selectWork_info(userid);
    }
}