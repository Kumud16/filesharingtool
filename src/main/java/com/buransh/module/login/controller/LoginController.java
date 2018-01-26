package com.buransh.module.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String showLogin() {
		System.out.println(" coming here");
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerUser() {
		System.out.println(" regsitering");
		return "register";
	}
}
