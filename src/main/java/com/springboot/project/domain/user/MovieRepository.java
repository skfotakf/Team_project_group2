package com.springboot.project.domain.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;

@Mapper
public interface MovieRepository {

	public List<MainChartDto> getChartAll(int code, String user_id);
	public List<MainChartDto> getChartAllRelease(int code, String user_id);
	public List<MainChartDto> getChartAllLike(int code, String user_id);
	
	// 좋아요 증감
	public int plusLikeCnt(MovieLikeDto movieLikeDto);
	public int minusLikeCnt(MovieLikeDto movieLikeDto);

	// 별점 증감
	public int insertRatingCnt(MovieRatingDto movieRatingDto);
	public int updateRatingCnt(MovieRatingDto movieRatingDto);
	public int deleteRatingCnt(MovieRatingDto movieRatingDto);
	
	/*------------장르 차트-------------*/
	public List<MovieDtlRespDto> getGenreAll(String user_id);
}
