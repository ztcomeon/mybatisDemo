/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CatImpl
 * Author:   Administrator
 * Date:     2020-03-11 17:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service.impl;

import com.example.mybatisDemo.entity.Cat;
import com.example.mybatisDemo.mapper.CatMapper;
import com.example.mybatisDemo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-11
 * @since 1.0.0
 */
@Service
public class CatImpl implements CatService {

    @Autowired
    CatMapper catMapper;

    @Override
    public Cat findById(int id) {
        return catMapper.findById(id);
    }
}