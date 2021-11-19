package com.springboot.project.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

	public int useridCheck(User user); // 아이디 중복확인용
	public int signup(User user); // 회원가입 insert 하기
	public User getUser(String id);
}
