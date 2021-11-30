package com.springboot.project.web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.domain.user.User;
import com.springboot.project.web.dto.auth.MypageDto;
import com.springboot.project.web.service.UserService;

import lombok.RequiredArgsConstructor;


// 회원정보 수정

@RequiredArgsConstructor
@Controller
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/auth/mypage")
	public String updateForm() {
		return "auth/mypage";
	}
	
	@ResponseBody
	@PutMapping("/auth/mypage")
	public String mypageForm(@RequestBody MypageDto mypageDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		int updateResult = userService.updateUser(mypageDto, principalDetails.getUser().getNumber());
		if(updateResult == 1) {
			User user = mypageDto.toEntity();
			principalDetails.getUser().setEmail(mypageDto.getEmail());
			principalDetails.getUser().setPassword(mypageDto.getPassword());
		}
			
		
		return Integer.toString(updateResult);
	}
}
