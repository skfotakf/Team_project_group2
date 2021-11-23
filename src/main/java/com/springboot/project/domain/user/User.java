package com.springboot.project.domain.user;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	private int number;
	private String id;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private String telephone;
	private String role;
	private String provider;
	private Date createdate;
	private Date updatedate;
}
