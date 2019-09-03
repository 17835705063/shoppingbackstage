package com.hyxy.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyxy.entity.User;
import com.hyxy.service.LoginService;

@Controller
@RequestMapping("LoginController")
public class LoginController {

	@Autowired
	private LoginService LoginService;
	
	@RequestMapping("login")
	public String login(@RequestParam Map<String, String> map,HttpServletRequest request) {
		System.out.println(map);
		//查询用户是否存在
		User user =  LoginService.login(map);
		System.out.println(user);
		if (user != null) {
			request.getSession().setAttribute("user", user);
		}else {
			return "redirect:login.jsp";
		}
		return "index";
	}
}




