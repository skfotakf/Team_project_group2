package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.domain.user.Movie;
import com.springboot.project.domain.user.MovieRepository;
import com.springboot.project.web.model.dto.MainChartDto;
import com.springboot.project.web.model.dto.MovieLikeDto;
import com.springboot.project.web.model.vo.MovieLikeVo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;

	
	private List<MainChartDto> chartAll;
	
	@Override // 메인 list
	public List<MainChartDto> getChartAll(int code) {
		System.out.println("되는중");
		return movieRepository.getChartAll(code);
	}
	@Override
	public List<MainChartDto> getChartAllRelease(int code) {
		
		return movieRepository.getChartAllRelease(code);
	}
	@Override
	public List<MainChartDto> getChartAllLike(int code) {
		// TODO Auto-generated method stub
		// Movie movie = chartAll.get(0).toEntity();
		return movieRepository.getChartAllLike(code);
	}
	
	/* 정배열 역배열 버튼(못넣음)
	@Override
	public List<MainChartDto> getChartAllDesc(int code) {
		System.out.println("반대로 되는중");
		return mainChartDao.getChartAllDesc(code);
	}
	@Override
	public List<MainChartDto> getChartAllReleaseDesc(int code) {
		// TODO Auto-generated method stub
		return mainChartDao.getChartAllReleaseDesc(code);
	}
	@Override
	public List<MainChartDto> getChartAllLikeDesc(int code) {
		// TODO Auto-generated method stub
		return mainChartDao.getChartAllLikeDesc(code);
	}
	*/

	@Override // 조회수 증가
	public Object plusLikeCnt(MovieLikeDto movieLikeDto) {
		return movieRepository.plusLikeCnt(movieLikeDto);
	}

}