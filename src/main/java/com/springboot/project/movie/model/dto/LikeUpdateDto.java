package com.springboot.project.movie.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LikeUpdateDto {
	
	private int mov_idn;  // 영화 아이디	
	private int mov_lik; // 영화 좋아요
	private int mov_lik_cnt; // 영화 좋아요 카운트
	private int number; // 회원 넘버

}
