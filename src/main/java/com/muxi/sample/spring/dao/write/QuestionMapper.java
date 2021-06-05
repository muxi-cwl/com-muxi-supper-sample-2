package com.muxi.sample.spring.dao.write;


import com.muxi.sample.spring.annotation.DynamicDataSourceType;
import com.muxi.sample.spring.entity.QuestionDO;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/
public interface QuestionMapper {

    @DynamicDataSourceType("write")
    QuestionDO selectById(Long id);
}
