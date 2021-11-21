package com.springboot.project.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.movie.commons.paging.Criteria;
import com.springboot.project.movie.domain.MovieVO;
import com.springboot.project.movie.mapper.MovieListDAO;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieListDAO movieListDAO;

	@Override
	public void create(MovieVO movieVO) throws Exception {
		movieListDAO.create(movieVO);
	}

	@Override
	public MovieVO read(int movie_no) throws Exception {
		return movieListDAO.read(movie_no);
	}

	@Override
	public void update(MovieVO movieVO) throws Exception {
		movieListDAO.update(movieVO);
	}

	@Override
	public void delete(MovieVO movieVO) throws Exception {
		movieListDAO.delete(movieVO);
	}

	@Override
	public List<MovieVO> listAll() throws Exception {
		return movieListDAO.listAll();
	}
	
	@Override
	public List<MovieVO> listCriteria(Criteria criteria) throws Exception {
		return movieListDAO.listCriteria(criteria);
	}
	
	@Override
	public List<MovieVO> countMovie(Criteria criteria) throws Exception {
		return movieListDAO.countMovie(criteria);
	}
	

}
