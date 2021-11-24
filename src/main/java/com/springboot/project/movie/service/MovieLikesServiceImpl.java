package com.springboot.project.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.movie.mapper.MovieLikeDAO;
import com.springboot.project.movie.model.vo.MovieVO;

@Service
public class MovieLikesServiceImpl implements MovieLikesService {

	@Autowired
	private MovieLikeDAO movieLikeDAO;

	@Override
	public int getListLike(MovieVO vo) {
		return movieLikeDAO.getListLike(vo);
	}

	@Override
	public void insertListLike(MovieVO vo) {
		movieLikeDAO.insertListLike(vo);
		movieLikeDAO.updateListLike(vo.getMov_idn());
	}

	@Override
	public void deleteListLike(MovieVO vo) {
		movieLikeDAO.deleteListLike(vo);
		movieLikeDAO.updateListLike(vo.getNumber());
	}



	
}
