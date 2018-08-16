package com.example.eureaserver.api;

import com.example.eureaserver.entity.UserEO;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auto
 */
@RequestMapping("/springloud/swagger")
@ApiResponses(value = {@ApiResponse(code = 400, message = "参数校验错误"), @ApiResponse(code = 401, message = "权限不足"), @ApiResponse(code = 403, message = "拒绝请求"), @ApiResponse(code = 404, message = "资源不存在"), @ApiResponse(code = 405, message = "请求方法不支持"), @ApiResponse(code = 413, message = "文件过大"), @ApiResponse(code = 415, message = "JSON解析错误"), @ApiResponse(code = 500, message = "内部错误")})
public interface UserApi {
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public UserEO findById(@RequestParam(value = "userId") Integer userId);
    @RequestMapping(value = "insertUser",method = RequestMethod.POST)
    public void insertUser(@RequestBody UserEO userEO);
    @RequestMapping(value = "delUser",method= RequestMethod.GET)
    public void delUser(@RequestParam("userId") Integer userId);
    @RequestMapping(value = "updateUser",method= RequestMethod.POST)
    public void updateUser(@RequestBody UserEO userEO);
}
