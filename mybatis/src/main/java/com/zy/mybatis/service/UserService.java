package com.zy.mybatis.service;

import com.zy.mybatis.domain.TUser;

public interface UserService {

    TUser selectUserById(Integer userId);
}
