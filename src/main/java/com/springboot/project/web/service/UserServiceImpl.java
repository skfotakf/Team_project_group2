package com.springboot.project.web.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.project.domain.user.User;
import com.springboot.project.domain.user.UserRepository;
import com.springboot.project.web.dto.auth.MypageDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Override
	public int updateUser(MypageDto mypageDto, int number) {
		User userEntity = mypageDto.toEntity();
		userEntity.setNumber(number);
		userEntity.setPassword(new BCryptPasswordEncoder().encode(userEntity.getPassword()));
		return userRepository.updateUser(userEntity);
	};
}
