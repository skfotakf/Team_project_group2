package com.springboot.project.web.dto.movie;

import java.util.Date;

import com.springboot.project.domain.movie.Movie;

import lombok.Builder;
import lombok.Data;

@Data
public class MainChartDto {
	
	
	//movie_mst
	private int mov_idn;  // 영화 아이디	
	private String mov_photo; // 영화 포스터
	private String mov_title; // 영화 제목
	private String mov_release; // 영화 개봉 날짜
	private int mov_viewCnt; // 영화 조회수
	private float mov_rat; // 영화 평점
	private int mov_rat_cnt; // 영화 평점 참가수
	private int mov_lik; // 영화 좋아요
	private int mov_lik_cnt; // 영화 좋아요 수
	
	private int number; // 회원 넘버
	//movie_like
	private int like_mov_idn; // 좋아요 눌린 영화
	private String like_user_id; // 좋아요 누른 사람
	//movie_rating
	private int rating_mov_idn; // 평가받은 영화
	private String rating_user_id; // 평가한 사람
	private int rating_rating; // 평가 점수
	
	public Movie toEntity() {
		return Movie.builder()
				.mov_idn(mov_idn)
				.mov_photo(mov_photo)
				.mov_title(mov_title)
				.mov_release(mov_release)
				.mov_viewCnt(mov_viewCnt)
				.mov_rat(mov_rat)
				.mov_rat_cnt(mov_rat_cnt)
				.mov_lik(mov_lik)
				.mov_lik_cnt(mov_lik_cnt)
				.number(number)
				.like_mov_idn(like_mov_idn)
				.like_user_id(like_user_id)
				.rating_mov_idn(rating_mov_idn)
				.rating_user_id(rating_user_id)
				.rating_rating(rating_rating)
				.build();
	}
	
	public Movie watchListEntity() {
		return Movie.builder()
					.mov_idn(mov_idn)
					.number(number)
					.build();
	}

}
