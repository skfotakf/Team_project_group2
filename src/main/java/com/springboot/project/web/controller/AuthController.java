package com.springboot.project.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.web.dto.auth.SignupDto;
import com.springboot.project.web.service.AuthService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AuthController {
	
	private final AuthService authService;

	@GetMapping("/auth/signin")
	public String signinForm() {
		return "auth/signin";
	}
	
	@GetMapping("/auth/singup")
	public String signupForm() {
		return "auth/signup";
	}
	
	@ResponseBody
	@PostMapping("auth/signup")	 // JSON 형태로 반환해주기 위해 Object 객체를 사용					
	public Object signup(@Valid SignupDto signupDto, BindingResult bindingResult) {
		// 오류 발견시
		if(bindingResult.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();
			for(FieldError error : bindingResult.getFieldError()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			
		}
	}
	
}
