package com.springboot.project.web.dto.auth;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.springboot.project.domain.user.User;

import lombok.Builder;
import lombok.Data;

// 데이터 Transfer 장소
@Data
public class SignupDto {
	
	@Size(min = 2, max = 20)
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	@NotBlank
	private String email;
	@NotBlank
	private String name;	
	@NotBlank
	private String telephone;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.email(email)
				.name(name)
				.telephone(telephone)
				.build();
				
	}
}
