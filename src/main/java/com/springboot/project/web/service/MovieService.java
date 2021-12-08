package com.springboot.project.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;
import com.springboot.project.web.dto.movie.MovieReviewDto;



public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainChartRespDto> getChartAll(int code, int number);
	
	public List<MainChartRespDto> getChartAllTop(int code, int page, int number);
	
	// 모든 영화 리스트 개봉일순
	public List<MainChartRespDto> getChartAllRelease(int code, int number);
	
	// 모든 영화 리스트 좋아요순
	public List<MainChartRespDto> getChartAllLike(int code, int number);
	
	/* 정배열 역배열 버튼(못넣음)
	// 모든 영화 리스트 역배열
	public List<MainChartDto> getChartAllDesc(int code);
	public List<MainChartDto> getChartAllReleaseDesc(int code);
	public List<MainChartDto> getChartAllLikeDesc(int code);
	*/
	
	// 좋아요 수 증감
	public Object plusLikeCnt(MovieLikeDto movieLikeDto);
	public Object minusLikeCnt(MovieLikeDto movieLikeDto);
	
	// 평가 수 증감
	public Object insertRatingCnt(MovieRatingDto movieRatingDto);
	public Object updateRatingCnt(MovieRatingDto movieRatingDto);
	public Object deleteRatingCnt(MovieRatingDto movieRatingDto);
	
//	public List<MainChartRespDto> getWatchList(int mov_idn, int number, date mov_release);
	
	public MovieDtlRespDto getMovieDtl(int mov_idn, int number);
	// public MovieDtlRespDto getMovieGenre(int gen_num, String genre);
	public List<MovieDtlRespDto> getMovieLike(int number);
	
	
	public List<MovieDtlRespDto> getGenreAll(int number);
	
	// 게시판 페이징
	public int parseIntPageNumber(String pageNumber);
	public List<MainChartRespDto> getMovieList(int pageNumber);
	public List<MovieDtlRespDto> getGenreAll(int number);
	
	
	//댓글 등록

	public List<MovieReviewDto> listReview(int mov_idn);

	
	public int insertReview(MovieReviewDto movieReviewDto);
	
}
