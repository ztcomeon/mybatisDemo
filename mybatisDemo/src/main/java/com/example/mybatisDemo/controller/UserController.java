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

import com.example.mybatisDemo.entity.Address;
import com.example.mybatisDemo.entity.Cat;
import com.example.mybatisDemo.entity.User;
import com.example.mybatisDemo.service.AddressService;
import com.example.mybatisDemo.service.CatService;
import com.example.mybatisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}