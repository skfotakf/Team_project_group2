package com.springboot.project.config.oauth2.provider;

import com.springboot.project.domain.user.User;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OAuth2UserDto {

	private String id;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private String telephone;
	private String role;
	private String provider;
	
	public User toEntity() {
		return User.builder()
				.id(id)
				.password(password)
				.email(email)
				.name(name)
				.nickname(nickname)
				.telephone(telephone)
				.role(role)
				.provider(provider)
				.build();
	}
	
	
	
}
