/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DogService
 * Author:   Administrator
 * Date:     2020-03-13 11:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.service;

import com.example.mybatisDemo.entity.Dog;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-13
 * @since 1.0.0
 */
public interface DogService {
    Dog findById(int id);

    void createDog(Dog dog);
}