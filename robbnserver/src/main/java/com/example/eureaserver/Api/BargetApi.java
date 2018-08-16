package com.example.eureaserver.Api;

import com.example.eureaserver.entity.BargetEO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/swagger/barget")
@ApiResponses(value = {@ApiResponse(code = 400, message = "参数校验错误"), @ApiResponse(code = 401, message = "权限不足"), @ApiResponse(code = 403, message = "拒绝请求"), @ApiResponse(code = 404, message = "资源不存在"), @ApiResponse(code = 405, message = "请求方法不支持"), @ApiResponse(code = 413, message = "文件过大"), @ApiResponse(code = 415, message = "JSON解析错误"), @ApiResponse(code = 500, message = "内部错误")})
public interface BargetApi {
    @RequestMapping(value = "/saveBarget" ,method = RequestMethod.POST)
    public void saveBarget(@RequestBody BargetEO barget);
}
