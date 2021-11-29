package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.web.model.dto.MainChartDto;
import com.springboot.project.web.model.vo.MovieLikeVo;


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
	
	// 조회수 증가
	public int plusLikeCnt(MovieLikeVo movieLikeVo);

}
