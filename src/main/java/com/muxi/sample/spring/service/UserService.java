package com.muxi.sample.spring.service;

import com.muxi.sample.spring.annotation.DynamicDataSourceType;
import com.muxi.sample.spring.dao.read.UserMapper;
import com.muxi.sample.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author muxi
 * @Date 2021/6/5
 * @Description
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @DynamicDataSourceType("read")
    public User selectById(Long id){
        return userMapper.selectById(id);
    }
}
