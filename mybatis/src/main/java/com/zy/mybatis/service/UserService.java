package com.zy.mybatis.service;

import com.zy.mybatis.domain.TUser;

import java.util.List;

public interface UserService {

    TUser selectUserById(Integer userId);
    List<TUser> getAllTuser();
}
