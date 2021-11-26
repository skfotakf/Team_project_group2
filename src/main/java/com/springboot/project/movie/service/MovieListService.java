package com.springboot.project.movie.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.springboot.project.movie.model.dto.LikeUpdateDto;
import com.springboot.project.movie.model.vo.MovieVO;

@Service
public interface MovieListService {

	// 모든 영화 리스트 불러오기
	public List<MovieVO> listAll();
	// 좋아요 관련
	public int likeLoginCheck(MovieVO movieVO); // 좋아요 체크
	// 만약 회원넘버가 null이라면 하트를 전부다 비운다 mov_lik -> 0
	public int likeCheck(LikeUpdateDto likeUpdateDto);  // 좋아요 클릭시 총 좋아요 증가, 하트 채워짐
	public int likeCheckCancel(LikeUpdateDto likeUpdateDto); // 좋아요 취소시 총 좋아요 감소, 하트 비워짐
	// 유저 별점 관련
	
 
}
