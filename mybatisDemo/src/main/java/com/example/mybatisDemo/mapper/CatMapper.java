/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: CatMapper
 * Author:   Administrator
 * Date:     2020-03-11 16:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.mybatisDemo.mapper;

import com.example.mybatisDemo.entity.Cat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020-03-11
 * @since 1.0.0
 */
@Mapper
@Component
public interface CatMapper {

    Cat findById(int id);
}