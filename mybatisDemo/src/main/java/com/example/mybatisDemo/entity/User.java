/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2020-03-10 17:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.entity;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-10
 * @since 1.0.0
 */
public class User {

    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    //用户--地址：：多对多，需要一个中间表，和jpa是不同的，多对多不需要在双方定义List<Object>
    //用户--猫：：一对一，在多方定义一方的ID（外键）便可以
    //用户--狗：：一对多
    private List<Dog> dog;

    private List<Address> addresses;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public List<Dog> getDog() {
        return dog;
    }

    public void setDog(List<Dog> dog) {
        this.dog = dog;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                ", dog=" + dog +
                ", addresses=" + addresses +
                '}';
    }


}