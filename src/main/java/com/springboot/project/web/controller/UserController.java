package com.springboot.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// 회원정보 수정
@Controller
public class UserController {
	
	@GetMapping("/user/update")
	public String updateForm() {
		return "user/update";
	}
}
