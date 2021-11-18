package com.springboot.project.domain.user;

public interface UserRepository {

	public int usernameCheck(User user); // 아이디 중복확인용
	public int signup(User user); // 회원가입 insert 하기
	public User getUser(String username);
}
