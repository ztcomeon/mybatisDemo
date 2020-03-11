/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserService
 * Author:   Administrator
 * Date:     2020-03-10 17:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service;

import com.example.mybatisDemo.entity.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-10
 * @since 1.0.0
 */
public interface UserService {

    User findById(int id);

    List<User> findByName(String name);
}