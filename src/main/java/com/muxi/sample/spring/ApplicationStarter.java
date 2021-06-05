package com.muxi.sample.spring;

import com.muxi.sample.spring.entity.QuestionDO;
import com.muxi.sample.spring.entity.User;
import com.muxi.sample.spring.service.QuestionService;
import com.muxi.sample.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/
public class ApplicationStarter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        QuestionService questionService = applicationContext.getBean("questionService", QuestionService.class);


        QuestionDO questionDO = questionService.selectById(20L);

        System.out.println(questionDO);

        UserService userService = applicationContext.getBean("userService", UserService.class);

        User user = userService.selectById(103L);

        System.out.println(user);


    }
}
