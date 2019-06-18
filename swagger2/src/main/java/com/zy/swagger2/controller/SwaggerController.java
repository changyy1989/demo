package com.zy.swagger2.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 502341194@gmail.com
 * @ClassName SwaggerController
 * @date 2019/6/18 9:50
 * @Description TODO
 * @Version 1.0
 **/
@Controller
public class SwaggerController {


    @ApiOperation(value="查询用户", notes="查询所有用户信息")
    @GetMapping(value = "showUser")
    @ResponseBody
    public String showUser() {
        return "111111111111111";
    }


    @ApiOperation(value="查询用户", notes="根据id查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String"),
    })
    @GetMapping(value = "getUser")
    @ResponseBody
    public String getUser(String id) {
        return "2222222222222";
    }
}
