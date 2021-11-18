package com.springboot.project.web.service;

import com.springboot.project.web.dto.auth.SignupDto;

public interface AuthService {
	
	public int signup(SignupDto signUpDto);
}
