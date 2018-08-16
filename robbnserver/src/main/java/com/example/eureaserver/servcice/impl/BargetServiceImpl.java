package com.example.eureaserver.servcice.impl;

import com.example.eureaserver.Mapper.BargetMapper;
import com.example.eureaserver.entity.BargetEO;
import com.example.eureaserver.entity.UserEO;
import com.example.eureaserver.servcice.BargetService;
import com.example.eureaserver.service.OutSider.OutUserApi;
import org.springframework.beans.factory.annotation.Autowired;

public class BargetServiceImpl implements BargetService {
    @Autowired
    OutUserApi outUserApi;
    @Autowired
    private BargetMapper bargetMapper;
    @Override
    public void saveBarget(BargetEO barget) {
        Integer userId = barget.getUserId();
        UserEO userEO = new UserEO();
        userEO.setUserId(userId);
        outUserApi.insertUser(userEO);

        bargetMapper.saveBarget(barget);
    }
}
