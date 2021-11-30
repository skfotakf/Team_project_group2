package com.springboot.project.web.service;

import org.springframework.stereotype.Service;

import com.springboot.project.web.dto.auth.MypageDto;

@Service
public interface UserService {

	public int updateUser(MypageDto mypageDto, int number);
}
