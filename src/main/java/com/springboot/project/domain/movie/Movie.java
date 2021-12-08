package com.springboot.project.domain.movie;

import com.springboot.project.web.dto.movie.MainChartRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

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
	private int createdate;
	//movie_like
	private int like_mov_idn; // 좋아요 눌린 영화
	private int like_number; // 좋아요 누른 사람
	//movie_rating
	private int rating_mov_idn; // 평가받은 영화
	private int rating_number; // 평가한 사람
	private int rating_rating; // 평가 점수
	//정렬기준
	private int sortCode;
	
	/*
	public MainChartRespDto toEntity() {
		return MainChartRespDto.builder()
				.mov_idn(mov_idn)
				.mov_photo(mov_photo)
				.mov_title(mov_title)
				.mov_release(mov_release)
				.mov_viewCnt(mov_viewCnt)
				.mov_rat(mov_rat)
				.mov_rat_cnt(mov_rat_cnt)
				.mov_lik(mov_lik)
				.mov_lik_cnt(mov_lik_cnt)
				.mov_gnr_idn(mov_gnr_idn)
				.mov_cht_idn(mov_cht_idn)
				.mov_viw_list_idn(mov_viw_list_idn)
				.number(number)
				.build();
	}
	
	public Movie WatchListEntity() {
		return Movie.builder()
					.mov_idn(mov_idn)
					.number(number)
					.build();
	}

	*/
}
