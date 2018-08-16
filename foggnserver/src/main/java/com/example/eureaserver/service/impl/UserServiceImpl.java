package com.example.eureaserver.service.impl;

import com.example.eureaserver.entity.UserEO;
import com.example.eureaserver.mapper.UserMapper;
import com.example.eureaserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserEO findById(Integer userId) {

        return userMapper.findById(userId);
    }

    @Override
    public void insertUser(UserEO userEO) {
        if(userEO == null){
            return;
        }
        UserEO user = new UserEO();
        user.setPassWorld(userEO.getPassWorld()==null? null: userEO.getPassWorld());
        user.setUserId(userEO.getUserId() == null ? null : userEO.getUserId());
        user.setUserName(userEO.getPassWorld() == null ? null : userEO.getUserName());
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(UserEO userEO) {
        if(userEO == null){
            return;
        }
        UserEO user = new UserEO();
        user.setPassWorld(userEO.getPassWorld()==null? null: userEO.getPassWorld());
        user.setUserId(userEO.getUserId() == null ? null : userEO.getUserId());
        user.setUserName(userEO.getPassWorld() == null ? null : userEO.getUserName());
        userMapper.updateUser(user);
    }

    @Override
    public void delUser(Integer userId) {
        if(userId == null){
            return;
        }
        userMapper.delUser(userId);
    }
}
