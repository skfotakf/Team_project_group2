package com.springboot.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable(); // csrf 비활성화
			http.authorizeRequests()  // 권한 요청
				.antMatchers("/", "index", "/user/**") // 이 메소드에 권한을 줌
				.authenticated() // 인증이 필요
				.anyRequest() // antMatchers 외에 모든 요청
				.permitAll() // 요청이 없어도 된다 (모든 권한을 부여한다.)
			.and()
			.formLogin() // 로그인 페이지 커스텀
				.loginPage("/auth/signin") //get 해준다
				.loginProcessingUrl("/auth/signin") //post controller를 따로 만들필요 없음(security가 자동으로 처리)
				.defaultSuccessUrl("/")  // 로그인 성공시 이동할 URL
			.and()
			.oauth2Login()
				.loginPage("/auth/signin")
				.userInfoEndpoint()
				/*
				 * 1. 코드를 받아온다(인증)
				 * 2. 에세스토큰(권한)
				 * 3. 사용자프로필 정보를 가져온다.
				 */
				.userService(null); // 가져온 프로필 후처리(사용되어질 서비스 필요)
			
		}

}
