package com.springboot.project.web.service;

import java.util.List;

import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;



public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainChartDto> getChartAll(int code);
	
	// 모든 영화 리스트 개봉일순
	public List<MainChartDto> getChartAllRelease(int code);
	
	// 모든 영화 리스트 좋아요순
	public List<MainChartDto> getChartAllLike(int code);
	
	/* 정배열 역배열 버튼(못넣음)
	// 모든 영화 리스트 역배열
	public List<MainChartDto> getChartAllDesc(int code);
	
	// 모든 영화 리스트 개봉일순 역배열
	public List<MainChartDto> getChartAllReleaseDesc(int code);

	// 모든 영화 리스트 개봉일순 역배열
	public List<MainChartDto> getChartAllLikeDesc(int code);
	*/
	
	// 좋아요 수 증가
	
	public Object plusLikeCnt(MovieLikeDto movieLikeDto);
	

}
