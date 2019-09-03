package com.hyxy.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyxy.dao.UserMapper;
import com.hyxy.entity.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Resource
	private UserMapper UserMapper;
	
	@Override
	public User login(Map<String, String> map) {
		return UserMapper.login(map);
	}

}
