package com.springboot.project.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.web.dto.auth.SigninDto;
import com.springboot.project.web.dto.auth.SigninRespDto;
import com.springboot.project.web.dto.auth.SignupDto;
import com.springboot.project.web.dto.auth.SignupRespDto;
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
	//로그인 
//	@PostMapping("/auth/signin")
//	public Object signInCheckForm(@Valid SigninDto signinDto, BindingResult bindingResult) {
//		
//		return "signinRespDto";//""없앨것
//	}
	

	
	@GetMapping("/auth/signup")
	public String signupForm() {
		return "auth/signup";
	}
	@GetMapping("/movie/gnr")
	public String gnrForm() {
		return "movie/gnr";
	}

	
	@ResponseBody
	@PostMapping("/auth/signup")	 // JSON 형태로 반환해주기 위해 Object 객체를 사용					
	public Object signup(@Valid SignupDto signupDto, BindingResult bindingResult) {
		// 오류 발견시
		if(bindingResult.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();
			for(FieldError error : bindingResult.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			SignupRespDto<Map<String, String>> signupRespDto = new SignupRespDto<Map<String,String>>();
			signupRespDto.setCode(400);
			signupRespDto.setMsg(errorMap);
			return signupRespDto;
		}else {
			// 회원가입 진행
			SignupRespDto<String> signupRespDto = new SignupRespDto<String>();
			int signupResult = authService.signup(signupDto);
			if(signupResult == 1) {
				// 회원가입 성공
				signupRespDto.setCode(200);
				signupRespDto.setMsg("JMKY의 회원이 되신 것을 축하드립니다!");
			} else if(signupResult == 2) {
				signupRespDto.setCode(410);
			} else {
				signupRespDto.setCode(500);
				signupRespDto.setMsg("회원가입 실패. 다시 확인해보세요.");
			}
			return signupRespDto;
		}
	}
	
}
