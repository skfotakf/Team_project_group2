package com.springboot.project.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.movie.model.dto.MainListDto;

@Service
public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainListDto> listAll();
	// 조회수 증가
	public int plusMovieListCnt(String mov_idn);

}
