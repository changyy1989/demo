package com.zy.springdata.repository;

import com.zy.springdata.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 502341194@gmail.com
 * @ClassName MemberRepository
 * @date 2019/6/14 11:03
 * @Description TODO
 * @Version 1.0
 **/
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
