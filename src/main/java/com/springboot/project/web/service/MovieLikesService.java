package com.springboot.project.web.service;

import com.springboot.project.web.model.dto.MovieLikeDto;
import com.springboot.project.web.model.vo.MovieVO;

public interface MovieLikesService {

	// 좋아요 누르기
	public int insertListLike(MovieVO vo);

	// 좋아요 지우기
	public int deleteListLike(MovieVO vo);

	// 좋아요 되어있는 정보 불러오기 -> movie_mst 에서 mov_lik 불러오기
	public void readListLike(MovieVO vo);

	// 좋아요 업데이트
	public void updateListLike(int mov_idn);
	
	public int getListLike(MovieVO vo);

}