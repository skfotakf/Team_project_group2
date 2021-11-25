package com.springboot.project.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.web.mapper.MainListDAO;
import com.springboot.project.web.model.dto.MainListDto;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MainListDAO movieListDAO;
	
	@Override // 메인 list
	public List<MainListDto> listAll() {
		return movieListDAO.listAll();
	}

	@Override // 조회수 증가
	public int plusMovieListCnt(String mov_idn) {
		return movieListDAO.plusMovieListCnt(Integer.parseInt(mov_idn));
	}

}