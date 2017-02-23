package com.ssh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssh.entity.User;
import com.ssh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping("/show")
	public User showUser(HttpServletRequest request,@RequestParam("id") int id){
		return userService.getUserById(id);
	}
	
}
