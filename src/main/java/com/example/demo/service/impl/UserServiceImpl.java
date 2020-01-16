package com.example.demo.service.impl;

import com.example.demo.bean.UserBean;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name) {
        UserBean info = userMapper.getInfo(name);
        if (info == null) {
            return new UserBean();
        }
        return info;
    }
}
