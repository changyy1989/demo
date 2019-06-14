package com.zy.springdata.controller;

import com.zy.springdata.domain.Member;
import com.zy.springdata.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 502341194@gmail.com
 * @ClassName MemberController
 * @date 2019/6/14 14:25
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource
    private MemberRepository MemberDao;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        List<Member> memberList = MemberDao.findAll();
        return "YOU ARE SUCCESS!" + memberList.toString();
    }

    /**
     * 查找所有图书
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        try {
            Map model = new HashMap();
            List<Member> memberList = MemberDao.findAll();
            model.put("memberList", memberList);
            return new ModelAndView("/views/memberList", model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("/list2")
    public String list2() {
        Map model = new HashMap();
        List<Member> memberList = MemberDao.findAll();
        model.put("memberList", memberList);
        return "/views/memberList";
    }

    /**
     * 添加图书
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Member member) {
        MemberDao.save(member);
        return "redirect:/member/list";
    }

    /**
     * 根据id查找图书
     */
    @RequestMapping("/preUpdate/{id}")
    public ModelAndView preUpdate(@PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("member", MemberDao.getOne(id));
        mav.setViewName("memberUpdate");
        return mav;
    }

    /**
     * 修改图书
     */
    @PostMapping("/update")
    public String update(Member member) {
        MemberDao.save(member); //依然是save，有id就修改，没有id就添加
        return "redirect:/member/list";
    }

    /**
     * 删除图书
     */
    @GetMapping("/delete")
    public String delete(Integer id) {
        MemberDao.deleteById(id);
        return "redirect:/member/list";
    }
}
