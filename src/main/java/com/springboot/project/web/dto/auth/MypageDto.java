package com.springboot.project.web.dto.auth;


import com.springboot.project.domain.user.User;

import lombok.Data;

@Data
public class MypageDto {
	private String password;
	private String email;
	
	public User toEntity() {
		return User.builder()
				.password(password)
				.email(email)
				.build();
				
	}
}
