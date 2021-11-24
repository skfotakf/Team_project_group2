package com.springboot.project.movie.service;

import com.springboot.project.movie.model.vo.MovieVO;

public interface MovieLikesService  {

	public int getListLike(MovieVO vo);

	public void insertListLike(MovieVO vo);
	
	public void deleteListLike(MovieVO vo);
	
	
}
