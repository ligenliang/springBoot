package com.example.eureaserver.controller;

import com.example.eureaserver.api.UserApi;
import com.example.eureaserver.entity.UserEO;
import com.example.eureaserver.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@Api(tags="1.0",description = "用户管理")
@RestController
@RefreshScope
public class UserController implements UserApi {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @ApiOperation(value="根据ID查询用户")
    @Override
    public UserEO findById(@RequestParam(value = "userId") Integer userId) {

        if(StringUtils.isBlank(userId.toString())){
            return null;
        }
        return userService.findById(userId);
    }
    @ApiOperation(value = "保存用户")
    @Override
    public void insertUser(UserEO userEO) {
        userService.insertUser(userEO);

    }
    @ApiOperation(value = "删除用户")
    @Override
    public void delUser(Integer userId) {
        if(userId == null){
            return;
        }
        userService.delUser(userId);
    }
    @ApiOperation(value = "更新用户")
    @Override
    public void updateUser(UserEO userEO) {
        userService.updateUser(userEO);
    }


}
