package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.web.model.dto.MainListDto;

@Service
public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainListDto> getListAll();
	
	//public List<MainListDto> getList();
	// 조회수 증가
	/*public int plusMovieListCnt(String mov_idn);*/

}
