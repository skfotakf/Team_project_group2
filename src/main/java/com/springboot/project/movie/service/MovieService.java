package com.springboot.project.movie.service;

import java.util.List;

import com.springboot.project.movie.commons.paging.Criteria;
import com.springboot.project.movie.domain.MovieVO;

public interface MovieService {
	
	void create(MovieVO movieVO) throws Exception;
	
	MovieVO read(int movie_no) throws Exception;
	
	void update(MovieVO movieVO) throws Exception;
	
	void delete(MovieVO movieVO) throws Exception;
	
	List<MovieVO> listAll() throws Exception;
	
	List<MovieVO> listCriteria(Criteria criteria) throws Exception;
	
	List<MovieVO> countMovie(Criteria criteria) throws Exception;

}
