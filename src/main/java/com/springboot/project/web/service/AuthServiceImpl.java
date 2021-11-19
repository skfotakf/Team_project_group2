package com.springboot.project.web.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.project.domain.user.User;
import com.springboot.project.domain.user.UserRepository;
import com.springboot.project.web.dto.auth.SignupDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService{
	
	private final UserRepository userRepository;

	@Override // 회원가입 
	public int signup(SignupDto signUpDto) {
		User user = signUpDto.toEntity();
		int usernameCheckResult = userRepository.useridCheck(user); // 중복검사
		if(usernameCheckResult == 1) {
			// 이미 존재하는 id
			return 2;
		} else {
			// 회원가입 가능
									// 비밀번호 받아와서 암호화 작업
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			user.setRole("ROLE_USER");
			// userRepository에서 user 가져오기
			int signupResult = userRepository.signup(user);
			return signupResult;
		}
	}
	
	
}
