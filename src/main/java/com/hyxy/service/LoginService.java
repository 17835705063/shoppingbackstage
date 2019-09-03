package com.hyxy.service;

import java.util.Map;

import com.hyxy.entity.User;

public interface LoginService {

	User login(Map<String, String> map);

}
