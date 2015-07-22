package com.businessoffice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.businessoffice.model.User;
import com.businessoffice.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/getUser")
	public void getUser(){
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getLogin()+"aaaaa");
	}
}
