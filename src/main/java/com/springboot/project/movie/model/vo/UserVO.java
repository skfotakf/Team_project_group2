package com.springboot.project.movie.model.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVO {
	
	private int number;
	private String id;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private String phoneNum;
	private String role;
	private String provider;

}
