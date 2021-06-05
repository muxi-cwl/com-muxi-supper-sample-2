package com.muxi.sample.mybatis.mapper;


import com.muxi.sample.spring.entity.QuestionDO;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/
public interface QuestionMapper {

    QuestionDO selectById(Long id);
}
