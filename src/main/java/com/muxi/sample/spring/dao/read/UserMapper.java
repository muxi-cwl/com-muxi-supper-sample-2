package com.muxi.sample.spring.dao.read;

import com.muxi.sample.spring.annotation.DynamicDataSourceType;
import com.muxi.sample.spring.entity.User;

public interface UserMapper {

   @DynamicDataSourceType("read")
   User selectById(Long id);
}
