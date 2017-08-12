package com.resume.service;

import com.resume.mapper.UserMapper;
import com.resume.model.User_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 将当前类注释为一个 Spring 的 bean
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService{
    //自动扫描注入
    @Autowired
    public UserMapper usermapper;
    //重写方法
    @Override
    public User_info login(String Name) {
        return usermapper.login(Name);
    }


}
