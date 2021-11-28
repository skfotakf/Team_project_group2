package com.springboot.project.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.model.dto.MainListDto;

@Mapper
public interface MainListDAO {
	
	// 모든 영화 리스트 불러오기
	public List<MainListDto> getListAll(int code);
	public List<MainListDto> getListAllRelease(int code);
	public List<MainListDto> getListAllLike(int code);
	
	/* 정배열 역배열 버튼(못넣음)
	 // 영화 리스트 불러오기 역배열
	public List<MainListDto> getListAllDesc(int code);
	public List<MainListDto> getListAllReleaseDesc(int code);
	public List<MainListDto> getListAllLikeDesc(int code);
	*/
	
	// 조회수 증가
	// public int plusMovieListCnt(int mov_idn);
	
}
