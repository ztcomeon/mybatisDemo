/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DogServiceImpl
 * Author:   Administrator
 * Date:     2020-03-13 11:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service.impl;

import com.example.mybatisDemo.entity.Dog;
import com.example.mybatisDemo.mapper.DogMapper;
import com.example.mybatisDemo.service.DogService;
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
public class DogServiceImpl implements DogService {

    @Autowired
    DogMapper dogMapper;

    @Override
    public Dog findById(int id) {
        return dogMapper.findById(id);
    }

    @Transactional
    @Override
    public void createDog(Dog dog) {
        dogMapper.createDog(dog);
    }
}