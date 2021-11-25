package com.springboot.project.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.model.dto.MainListDto;

@Mapper
public interface MainListDAO {
	
	// 모든 영화 리스트 불러오기
	public List<MainListDto> listAll();
	// 조회수 증가
	public int plusMovieListCnt(int mov_idn);
	
}
