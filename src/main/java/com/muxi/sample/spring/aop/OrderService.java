package com.muxi.sample.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @author muxi
 * @Date 2021/6/5
 * @Description
 **/

//@Service
public class OrderService {

    @MyAnnotation("read")
    public String sayHello(){
        return "hello word";
    }

    @MyAnnotation("write")
    public String sayHello2(){
        return "hello word";
    }
}
