/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserAndAddress
 * Author:   Administrator
 * Date:     2020-03-12 14:47
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
 * @create 2020-03-12
 * @since 1.0.0
 */
public class UserAndAddress {

    //用户和地址是多对多的关系，需要一个中间表，mybatis需要手动去维护这个中间表
    private User user;
    private Address address;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserAndAddress{" +
                "userId=" + user +
                ", addressId=" + address +
                '}';
    }
}