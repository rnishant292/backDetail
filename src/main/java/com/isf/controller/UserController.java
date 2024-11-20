package com.isf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isf.model.db.UserDetails;
import com.isf.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
//http://localhost:8080/register
	@PostMapping("/register")
	public UserDetails register (@RequestBody UserDetails user) { return userService.register(user); }
//http://localhost:8080/login
	@PostMapping("/login")
	public String login(@RequestBody UserDetails user){
		System.out.println(user);	
		return userService.verify(user);
	}
}