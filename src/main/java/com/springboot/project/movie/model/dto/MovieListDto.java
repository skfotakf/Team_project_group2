package com.springboot.project.movie.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieListDto {

	//movie_mst
	private int mov_idn;  // 영화 아이디	
	private String mov_photo; // 영화 포스터
	private String mov_title; // 영화 제목
	private String mov_release; // 영화 개봉 날짜
	private int mov_gnr; // 영화 장르
	private int mov_viewCnt; // 영화 조회수
	private int mov_rat; // 영화 별점
	private int mov_rat_cnt; // 영화 별점 카운트
	private int mov_lik; // 영화 좋아요
	private int mov_lik_cnt; // 영화 좋아요 카운트
		
	private int number; // 회원 넘버
	
}
