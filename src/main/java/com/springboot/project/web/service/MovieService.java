package com.springboot.project.web.service;

import java.util.List;

import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;



public interface MovieService {
	
	// 모든 영화 리스트 불러오기
	public List<MainChartDto> getChartAll(int code, String user_id);
	
	// 모든 영화 리스트 개봉일순
	public List<MainChartDto> getChartAllRelease(int code, String user_id);
	
	// 모든 영화 리스트 좋아요순
	public List<MainChartDto> getChartAllLike(int code, String user_id);
	
	/* 정배열 역배열 버튼(못넣음)
	// 모든 영화 리스트 역배열
	public List<MainChartDto> getChartAllDesc(int code);
	
	// 모든 영화 리스트 개봉일순 역배열
	public List<MainChartDto> getChartAllReleaseDesc(int code);

	// 모든 영화 리스트 개봉일순 역배열
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
	
	public MovieDtlRespDto getMovieGenre(int gen_num, String genre);

}
