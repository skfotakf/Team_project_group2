package com.springboot.project.domain.movie;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;

@Mapper
public interface MovieRepository {

	public List<MainChartRespDto> getChartAll(int code);
	public List<MainChartRespDto> getChartAllRelease(int code);
	public List<MainChartRespDto> getChartAllLike(int code);
	public List<MainChartDto> getsChartAll(int code);

	public int plusLikeCnt(MovieLikeDto movieLikeDto);
	
	public MovieDtl getMovieDtl(MovieDtl movieDtl);
	
	public MovieDtl getMovieGenre(MovieDtl movieDtl); 

}
