/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserController
 * Author:   Administrator
 * Date:     2020-03-10 17:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.controller;

import com.example.mybatisDemo.entity.*;
import com.example.mybatisDemo.service.*;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-10
 * @since 1.0.0
 */
@RestController
@RequestMapping
public class UserController {

    //相关处理代码应该写在service里面，这里为了简化测试
    //======================user相关==============================
    @Autowired
    private UserService userService;

    @RequestMapping("findUserById")
    public Map<String, Object> findUserById(@RequestParam int id) {
        User user = userService.findById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("result", user);
        return map;
    }

    @RequestMapping("findUserByName")
    public Map<String, Object> findUserByName(@RequestParam String name) {
        List<User> users = userService.findByName(name);
        Map<String, Object> map = new HashMap<>();
        map.put("result", users);
        return map;
    }

    @RequestMapping("createUser")
    public Map<String, Object> createUser() {
        User user = new User();
        user.setUserName("测试" + RandomUtils.nextInt());
        user.setRealName("ww");
        user.setPassWord("tt" + RandomUtils.nextInt());
        Map<String, Object> map = new HashMap<>();
        try {
            userService.createUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    //======================cat相关==============================
    @Autowired
    CatService catService;

    @RequestMapping("findCatById")
    public Map<String, Object> findCatById(@RequestParam int id) {
        Cat cat = catService.findById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("result", cat);
        return map;
    }

    @Autowired
    AddressService addressService;

    @RequestMapping("findAddressById")
    public Map<String, Object> findAddressById(@RequestParam int id) {
        Address address = addressService.findById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("result", address);
        return map;
    }


    //======================dog相关==============================
    @Autowired
    DogService dogService;

    @RequestMapping("findDogById")
    public Map<String, Object> findDogById(@RequestParam int id) {
        Dog dog = dogService.findById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("result", dog);
        return map;
    }

    @RequestMapping("createDog")
    public Map<String, Object> createDog() {
        Dog dog = new Dog();
        dog.setName("测试" + RandomUtils.nextInt());
        User user = userService.findById(1);
        dog.setUser(user);
        Map<String, Object> map = new HashMap<>();
        try {
            dogService.createDog(dog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    //======================UserAndAddress相关==============================
    @Autowired
    UserAndAddressService userAndAddressService;

    @RequestMapping("createUserAndAddress")
    public Map<String, Object> createUserAndAddress() {


        Map<String, Object> map = new HashMap<>();
        //模拟一个用户绑定了多个地址
        User user = userService.findById(3);
        Address address1 = addressService.findById(1);
        Address address2 = addressService.findById(2);
        List<Address> list = new ArrayList<>();
        list.add(address1);
        list.add(address2);
        user.setAddresses(list);


        try {
            //模拟接收到这个绑定信息，多对多维护的是中间表，对中间表进行新增
            List<Address> addresses = user.getAddresses();
            for (Address add : addresses) {
                UserAndAddress UserAndAddress = new UserAndAddress();
                UserAndAddress.setUser(user);
                UserAndAddress.setAddress(add);
                userAndAddressService.createUserAndService(UserAndAddress);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}