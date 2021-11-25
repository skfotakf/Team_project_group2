package com.springboot.project.movie.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MainListDto {
	
	
	//movie_mst
	private int mov_idn;  // 영화 아이디	
	private String mov_title; // 영화 제목
	private String mov_release; // 영화 개봉 날짜
	private int mov_viewCnt; // 영화 조회수
	private int mov_lik_idn; // 영화 좋아요 아이디
	private int mov_rat_idn; // 영화 별점 아이디
	

}
