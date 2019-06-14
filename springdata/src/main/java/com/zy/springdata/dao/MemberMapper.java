package com.zy.springdata.dao;

import com.zy.springdata.domain.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}
