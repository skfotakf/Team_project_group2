package com.springboot.project.web.dto.auth;

import com.springboot.project.domain.user.User;

public class SignupDto {

	private String email;
	private String password;
	private String username;
	private String nickname;
	private String phoneNum;
	
	public User toEntity() {
		return User.builder()
				.email(email)
				.password(password)
				.username(username)
				.nickname(nickname)
				.phoneNum(phoneNum)
				.build();
				
	}
}
