package com.zy.mongo.dao;

import com.zy.mongo.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * @author 502341194@gmail.com
 * @ClassName UserDao
 * @date 2019/6/14 10:08
 * @Description TODO
 * @Version 1.0
 **/
@Component
public class UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    /**
     * 创建对象
     */
    public void saveMember(Member member) {
        mongoTemplate.save(member);
    }

    /**
     * 根据用户名查询对象
     *
     * @return
     */
    public Member findMemberByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        Member mgt = mongoTemplate.findOne(query, Member.class);
        return mgt;
    }

    /**
     * 更新对象
     */
    public void updateMember(Member Member) {
        Query query = new Query(Criteria.where("id").is(Member.getId()));
        Update update = new Update().set("age", Member.getAge()).set("name", Member.getName());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Member.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,MemberEntity.class);
    }

    /**
     * 删除对象
     *
     * @param id
     */
    public void deleteMemberById(Integer id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Member.class);
    }
}
