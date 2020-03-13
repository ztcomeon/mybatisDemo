/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   Administrator
 * Date:     2020-03-10 17:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service.impl;

import com.example.mybatisDemo.entity.User;
import com.example.mybatisDemo.mapper.UserMapper;
import com.example.mybatisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-10
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(int id) {
        return  userMapper.findById(id);
    }

    @Override
    public List<User> findByName(String name) {

        return userMapper.findByName(name);
    }

    @Transactional
    @Override
    public void createUser(User user) {
         userMapper.createUser(user);
    }
}