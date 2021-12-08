package com.springboot.project.domain.movie;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Mapper
public interface MovieRepository {

	
	/*----------박스오피스,탑 차트---------*/
	public List<MainChartRespDto> getChartAll(int code, int number);
	public List<MainChartRespDto> getChartAllTop(Movie movie);
	public List<MainChartRespDto> getChartAllRelease(int code, int number);
	public List<MainChartRespDto> getChartAllLike(int code, int number);
	public List<MainChartDto> getsChartAll(int code);

	// 좋아요 증감
	public int plusLikeCnt(MovieLikeDto movieLikeDto);
	public int minusLikeCnt(MovieLikeDto movieLikeDto);
	
	// 별점 증감
	public int insertRatingCnt(MovieRatingDto movieRatingDto);
	public int updateRatingCnt(MovieRatingDto movieRatingDto);
	public int deleteRatingCnt(MovieRatingDto movieRatingDto);
	
	/*----------장르 차트------------*/
	public List<MovieDtlRespDto> getGenreAll(int number);
	
	/*----------디테일 페이지----------*/
	
	
//		public MovieDtl getMovieDtl(MovieDtl movieDtl);
//		public MovieDtl getMovieGenre(MovieDtl movieDtl);
	
	public MovieDtlRespDto getMovieDtl(int mov_idn, int number);
	public MovieDtl getMovieGenre(MovieDtl movieDtl);
	public List<MovieDtlRespDto> getMovieLike(int number);
	
	 
	

}
