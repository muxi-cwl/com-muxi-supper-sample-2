package com.muxi.sample.mybatis;

import com.muxi.sample.mybatis.mapper.QuestionMapper;
import com.muxi.sample.spring.entity.QuestionDO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 *
 *
 * mybatis的原生的使用方式 实例
 *
 **/
public class MybatisOriginalDemo {

    public static void main(String[] args) {

        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);


        SqlSession sqlSession = sqlSessionFactory.openSession();

        QuestionMapper mapper = sqlSession.getMapper(QuestionMapper.class);


        QuestionDO questionDO = mapper.selectById(10L);

        System.out.println(questionDO);


    }



}
