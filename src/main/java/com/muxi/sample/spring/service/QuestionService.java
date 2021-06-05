package com.muxi.sample.spring.service;


import com.muxi.sample.spring.annotation.DynamicDataSourceType;
import com.muxi.sample.spring.dao.write.QuestionMapper;
import com.muxi.sample.spring.entity.QuestionDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @DynamicDataSourceType
    public QuestionDO selectById(long id){
        return questionMapper.selectById(id);
    }
}
