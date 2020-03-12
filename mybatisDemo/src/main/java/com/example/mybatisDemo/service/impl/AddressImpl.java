/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AddressImpl
 * Author:   Administrator
 * Date:     2020-03-11 17:21
 * Description: \
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service.impl;

import com.example.mybatisDemo.entity.Address;
import com.example.mybatisDemo.mapper.AddressMapper;
import com.example.mybatisDemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author Administrator
 * @create 2020-03-11
 * @since 1.0.0
 */
@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public Address findById(int id) {
        return addressMapper.findById(id);
    }
}