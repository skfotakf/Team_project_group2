package com.springboot.project.movie.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieVO {

	//movie_mst
	private int movie_no; // 게시글 넘버
	private String title; // 제목
	private String content; // 디테일 내용?? 페이지 이동이라 내용이 더 필요한지 모르겠음
	private String movie_date; // 개봉일자
	private int viewcnt; // 조회수
	private int contentLike; //좋아요 수

	
}
