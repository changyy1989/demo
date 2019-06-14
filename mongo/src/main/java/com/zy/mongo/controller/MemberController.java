package com.zy.mongo.controller;

import com.zy.mongo.dao.UserDao;
import com.zy.mongo.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 502341194@gmail.com
 * @ClassName MemberController
 * @date 2019/6/14 10:03
 * @Description TODO
 * @Version 1.0
 **/
@RestController
public class MemberController {

    @Autowired
    private UserDao mtdao;

    @GetMapping(value = "/save")
    public String saveMember() throws Exception {
        Member mgMember = new Member();
        mgMember.setId(11);
        mgMember.setAge(33);
        mgMember.setName("ceshi");
        mtdao.saveMember(mgMember);
        return "添加成功！";
    }

    @GetMapping(value = "/find")
    public Member findMemberByName() {
        Member mgMember = mtdao.findMemberByName("ceshi");
        System.out.println("mgMember is " + mgMember);
        return mgMember;
    }

    @GetMapping(value = "/update")
    public String updateMember() {
        Member mgMember = new Member();
        mgMember.setId(11);
        mgMember.setAge(44);
        mgMember.setName("ceshi2");
        mtdao.updateMember(mgMember);
        return "修改成功！";
    }

    @GetMapping(value = "/delete")
    public String deleteMemberById() {
        mtdao.deleteMemberById(11);
        return "删除成功！";
    }

}
