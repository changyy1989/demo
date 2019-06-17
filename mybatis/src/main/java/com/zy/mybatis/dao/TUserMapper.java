package com.zy.mybatis.dao;

import com.zy.mybatis.domain.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TUserMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    List<TUser> getAllTuser();

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}