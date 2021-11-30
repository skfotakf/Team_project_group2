package com.springboot.project.config.auth;

import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.project.domain.user.User;
import com.springboot.project.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService{
	
	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, InternalAuthenticationServiceException {
		System.out.println(username);
		User userEntity = userRepository.getUser(username);
//		User userEntity2 = userRepository.getUser("zzz1234");
		//System.out.println(userEntity);
//		System.out.println(userEntity2);
		if(userEntity == null) {
			return null;
		} else {
			UserDetails principalDetails = new PrincipalDetails(userEntity);
			return principalDetails;
		}
	}
}
