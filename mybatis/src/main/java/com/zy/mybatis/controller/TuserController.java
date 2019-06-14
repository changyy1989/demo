package com.zy.mybatis.controller;

import com.zy.mybatis.domain.TUser;
import com.zy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 502341194@gmail.com
 * @ClassName TuserController
 * @date 2019/6/14 16:01
 * @Description TODO
 * @Version 1.0
 **/
@Controller
public class TuserController {

    @Autowired
    private UserService userServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/")
    public String home() {
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(value = "/getTuser")
    public String getTuser() {
        TUser tuser = userServiceImpl.selectUserById(1);
        return tuser.toString();
    }
}
