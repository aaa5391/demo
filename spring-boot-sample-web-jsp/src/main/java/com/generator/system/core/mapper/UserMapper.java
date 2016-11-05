package com.generator.system.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.generator.system.common.mapper.MyMapper;
import com.generator.system.core.entity.User;

public interface UserMapper extends MyMapper<User> {
	
	List<User> loadAllUsers();

	User findUserByName(@Param("username")String username);
	
}