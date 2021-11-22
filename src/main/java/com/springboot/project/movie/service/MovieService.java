package com.springboot.project.movie.service;

import java.util.List;

import com.springboot.project.movie.commons.paging.Criteria;
import com.springboot.project.movie.domain.MovieVO;

public interface MovieService {
	
	// 게시글 생성 - 등록
	void create(MovieVO movieVO) throws Exception;
	// 게시글 읽기 -> 디테일 페이지 이동(디테일 내용이 보여짐
	MovieVO read(int movie_no) throws Exception;
	// 게시글 수정
	void update(MovieVO movieVO) throws Exception;
	// 게시글 삭제
	void delete(MovieVO movieVO) throws Exception;
	// 전체 게시글 보기
	List<MovieVO> listAll() throws Exception;
	// 페이징 처리
	List<MovieVO> listCriteria(Criteria criteria) throws Exception;
	
	List<MovieVO> countMovie(Criteria criteria) throws Exception;
	//게시글 좋아요
	void contentLike(int movie_no) throws Exception;

}
