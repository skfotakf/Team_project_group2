package com.springboot.project.movie.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.springboot.project.movie.model.dto.MovieRatingDto;
import com.springboot.project.movie.model.vo.MovieVO;

public interface MovieRatingService {

	// 유저 넘버가 평가하고자 하는 영화 리스트 키값 가져오기
	public List<MovieRatingDto> getMovieList();
	// 해당 유저가 이 영화를 평가 체크
	public boolean ratingCheck(MovieVO movieVO, HttpSession session);
	// 영화 평가 정보를 담는다.
	public MovieVO memberRatingCheck(MovieVO movieVO);
	
}
