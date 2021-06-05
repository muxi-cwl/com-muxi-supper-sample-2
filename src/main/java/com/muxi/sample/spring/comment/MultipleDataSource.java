package com.muxi.sample.spring.comment;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author muxi
 * @Date 2021/6/5
 * @Description
 **/
public class MultipleDataSource extends AbstractRoutingDataSource {

    private static final ThreadLocal<String> dataSourceKey = new ThreadLocal<>();

    public static void setDataSourceKey(String key){
        dataSourceKey.set(key);
    }


    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }

    public static void clearDataSource(){
        dataSourceKey.remove();
    }
}
