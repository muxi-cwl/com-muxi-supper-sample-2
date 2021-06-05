package com.muxi.sample.spring.aspect;

import com.muxi.sample.spring.annotation.DynamicDataSourceType;
import com.muxi.sample.spring.comment.MultipleDataSource;
import com.muxi.sample.spring.enums.DynamicDataSourceEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author muxi
 * @Date 2021/6/5
 * @Description
 **/

@Aspect
@Order(1000001)
@Component
public class DynamicDataSourceAspect {

    @Pointcut("@annotation(dynamicDataSourceType)")
    public void choose(DynamicDataSourceType dynamicDataSourceType){

    }

    public void pointCut(){};

    @Around("choose(dynamicDataSourceType)")
    public Object aspect(ProceedingJoinPoint joinPoint,DynamicDataSourceType dynamicDataSourceType) throws Throwable {

        String value = dynamicDataSourceType.value();
        if(DynamicDataSourceEnum.WRITE.is(value)){
            MultipleDataSource.setDataSourceKey(DynamicDataSourceEnum.WRITE.getValue());
        }else {
            MultipleDataSource.setDataSourceKey(DynamicDataSourceEnum.READ.getValue());
        }
        return joinPoint.proceed();
    }
}
