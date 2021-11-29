package com.springboot.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;


// 회원정보 수정
@Controller
public class UserController {
	
	
	@GetMapping("/auth/mypage")
	public String updateForm() {
		return "auth/mypage";
	}
	
	@PutMapping("/auth/mypage")
	public 
}
