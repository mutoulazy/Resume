package com.resume.mapper;

/**
 * mapper层相当于SSH中的dao层
 */

import com.resume.model.User_info;

public interface UserMapper {
    //登录查询
    public User_info login(String Name);

}
