package com.zy.mybatis.controller;

import com.zy.mybatis.domain.TUser;
import com.zy.mybatis.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 502341194@gmail.com
 * @ClassName TuserController
 * @date 2019/6/14 16:01
 * @Description TODO
 * @Version 1.0
 **/
@Controller
public class TuserController {

    private static Logger logger = LoggerFactory.getLogger("TuserController");

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


    /**
     * 获取所有用户列表
     * @return
     */
    @RequestMapping(value = "/getUserList")
    public ModelAndView getUserList() {
        Map map = new HashMap();
        List<TUser> userList = userServiceImpl.getAllTuser();
        map.put("userList", userList);
        for(TUser tm : userList){
            logger.info(tm+"====");
        }
        return new ModelAndView("/views/memberList", map);
    }
}
