package com.springboot.project.domain.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.web.model.dto.MainChartDto;
import com.springboot.project.web.model.dto.MovieLikeDto;

@Mapper
public interface MovieRepository {

	public List<MainChartDto> getChartAll(int code);
	public List<MainChartDto> getChartAllRelease(int code);
	public List<MainChartDto> getChartAllLike(int code);
	

	public int plusLikeCnt(MovieLikeDto movieLikeDto);

}
