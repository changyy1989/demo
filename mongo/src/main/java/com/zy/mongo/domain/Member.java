package com.zy.mongo.domain;

/**
 * @author 502341194@gmail.com
 * @ClassName Member
 * @date 2019/6/14 10:10
 * @Description TODO
 * @Version 1.0
 **/
public class Member {

    private Integer id;
    private Integer age;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
