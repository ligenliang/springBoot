package com.example.eureaserver.controller;

import com.example.eureaserver.Api.BargetApi;
import com.example.eureaserver.entity.BargetEO;
import com.example.eureaserver.servcice.BargetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@Api(tags="1.0",description = "费用管理")
@RestController
@RefreshScope
public class BargetController implements BargetApi {
    @Autowired
    private BargetService bargetService;
    @ApiOperation(value = "保存费用")
    @Override
    public void saveBarget(BargetEO barget) {

         bargetService.saveBarget(barget);
    }
}
