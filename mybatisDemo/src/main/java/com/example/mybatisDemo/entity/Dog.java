/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Dog
 * Author:   Administrator
 * Date:     2020-03-13 11:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.entity;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-13
 * @since 1.0.0
 */
public class Dog {

    private Integer id;
    private String name;

    //一对多的关系，在多的一方维护外键便可（数据表对应字段为userId）
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}