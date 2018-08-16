package com.example.eureaserver.service;

import com.example.eureaserver.entity.UserEO;

public interface  UserService{
    UserEO findById(Integer userId);

    void insertUser(UserEO userEO);

    void updateUser(UserEO userEO);

    void delUser(Integer userId);
}