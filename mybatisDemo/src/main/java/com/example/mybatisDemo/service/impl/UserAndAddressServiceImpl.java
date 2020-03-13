/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserAndAddressServiceImpl
 * Author:   Administrator
 * Date:     2020-03-13 17:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service.impl;

import com.example.mybatisDemo.entity.UserAndAddress;
import com.example.mybatisDemo.mapper.UserAndAddressMapper;
import com.example.mybatisDemo.service.UserAndAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-13
 * @since 1.0.0
 */
@Service
public class UserAndAddressServiceImpl implements UserAndAddressService {

    @Autowired
    UserAndAddressMapper userAndAddressMapper;

    @Transactional
    @Override
    public void createUserAndService(UserAndAddress userAndAddress) {
        userAndAddressMapper.createUserAndAddress(userAndAddress);
    }
}