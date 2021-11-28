package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.web.model.dto.MainListDto;

@Service
public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainListDto> getListAll(int code);
	
	// 모든 영화 리스트 개봉일순
	public List<MainListDto> getListAllRelease(int code);
	
	// 모든 영화 리스트 좋아요순
	public List<MainListDto> getListAllLike(int code);
	
	/* 정배열 역배열 버튼(못넣음)
	// 모든 영화 리스트 역배열
	public List<MainListDto> getListAllDesc(int code);
	
	// 모든 영화 리스트 개봉일순 역배열
	public List<MainListDto> getListAllReleaseDesc(int code);

	// 모든 영화 리스트 개봉일순 역배열
	public List<MainListDto> getListAllLikeDesc(int code);
	*/
	
	
	//public List<MainListDto> getList();
	// 조회수 증가
	/*public int plusMovieListCnt(String mov_idn);*/

}
