package com.zy.mybatis.service.impl;

import com.zy.mybatis.dao.TUserMapper;
import com.zy.mybatis.domain.TUser;
import com.zy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 502341194@gmail.com
 * @ClassName UserServiceImpl
 * @date 2019/6/14 16:06
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser selectUserById(Integer userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<TUser> getAllTuser() {
        return tUserMapper.getAllTuser();
    }
}
