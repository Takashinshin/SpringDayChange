package com.example.demo.login.config;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	
	public User identifyUser(String userName);
}
