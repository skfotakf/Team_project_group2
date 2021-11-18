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

	private int id;
	private String username;
	private String password;
	private String email;
	private String name;
	private String nickname;
	private String phoneNum;
	private String role;
	private String provide;
	private Date createdate;
	private Date updatedate;
}
