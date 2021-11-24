package com.springboot.project.movie.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.movie.model.dto.MovieLikeDto;
import com.springboot.project.movie.model.vo.MovieVO;

@Mapper
public interface MovieLikeDAO {
	
	// 좋아요 누르기
	public void insertListLike(MovieLikeDto dto);
	// 좋아요 지우기
	public void deleteListLike(MovieLikeDto dto);
	// 좋아요 되어있는 정보 불러오기 -> movie_mst 에서 mov_lik 불러오기
	public void readListLike(MovieLikeDto dto);
	// 좋아요 업데이트 
	public void updateListLike(int mov_idn);
}
