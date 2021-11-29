package com.springboot.project.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.model.dto.MainChartDto;

@Mapper
public interface MainChartDao {
	
	// 모든 영화 리스트 불러오기
	public List<MainChartDto> getChartAll(int code);
	public List<MainChartDto> getChartAllRelease(int code);
	public List<MainChartDto> getChartAllLike(int code);
	
	/* 정배열 역배열 버튼(못넣음)
	 // 영화 리스트 불러오기 역배열
	public List<MainChartDto> getChartAllDesc(int code);
	public List<MainChartDto> getChartAllReleaseDesc(int code);
	public List<MainChartDto> getChartAllLikeDesc(int code);
	*/
	
	// 조회수 증가
	public int plusLikeCnt(int mov_idn);
	
}
