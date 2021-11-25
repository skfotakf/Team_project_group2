package com.springboot.project.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.web.mapper.MovieLikeDAO;
import com.springboot.project.web.model.dto.MovieLikeDto;
import com.springboot.project.web.model.vo.MovieVO;

@Service
public class MovieLikesServiceImpl implements MovieLikesService {

	@Autowired
	private MovieLikeDAO movieLikeDAO;

	@Override
	public void insertListLike(MovieLikeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteListLike(MovieLikeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readListLike(MovieLikeDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateListLike(int mov_idn) {
		// TODO Auto-generated method stub
		
	}

	


	
}