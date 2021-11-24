package com.springboot.project.movie.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.movie.model.vo.MovieVO;

@Mapper
public interface MovieLikeDAO {
	
	public int getListLike(MovieVO vo);

	public void insertListLike(MovieVO vo);
	
	public void deleteListLike(MovieVO vo);

	public void updateListLike(int mov_idn);
}
