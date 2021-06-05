package com.muxi.sample.spring;

import com.muxi.sample.spring.aop.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author muxi
 * @Date 2021/6/4
 * @Description
 **/
public class ApplicationStarterAop {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAop.xml");

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        System.out.println(orderService.sayHello());

        System.out.println(orderService.sayHello2());

//        QuestionService questionService = applicationContext.getBean("questionService", QuestionService.class);
//
//
//        QuestionDO questionDO = questionService.selectById(20L);
//
//        System.out.println(questionDO);
//
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//
//        User user = userService.selectById(103L);
//
//        System.out.println(user);


    }
}
