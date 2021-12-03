package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.domain.user.Movie;
import com.springboot.project.domain.user.MovieRepository;
import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;

	
	private List<MainChartDto> chartAll;
	
	@Override // 메인 list
	public List<MainChartDto> getChartAll(int code, String user_id) {
		System.out.println("되는중");
		return movieRepository.getChartAll(code, user_id);
	}
	@Override
	public List<MainChartDto> getChartAllRelease(int code, String user_id) {
		
		return movieRepository.getChartAllRelease(code, user_id);
	}
	@Override
	public List<MainChartDto> getChartAllLike(int code, String user_id) {
		// TODO Auto-generated method stub
		// Movie movie = chartAll.get(0).toEntity();
		return movieRepository.getChartAllLike(code, user_id);
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

	// 좋아요 증감
	@Override
	public Object plusLikeCnt(MovieLikeDto movieLikeDto) {
		return movieRepository.plusLikeCnt(movieLikeDto);
	}
	@Override
	public Object minusLikeCnt(MovieLikeDto movieLikeDto) {
		
		return movieRepository.minusLikeCnt(movieLikeDto);
	}
	
	// 별점 입력, 수정, 삭제
	@Override
	public Object insertRatingCnt(MovieRatingDto movieRatingDto) {
		
		return movieRepository.insertRatingCnt(movieRatingDto);
	}
	@Override
	public Object updateRatingCnt(MovieRatingDto movieRatingDto) {
		
		return movieRepository.updateRatingCnt(movieRatingDto);
	}
	@Override
	public Object deleteRatingCnt(MovieRatingDto movieRatingDto) {
		
		return movieRepository.deleteRatingCnt(movieRatingDto);
	}
	
	/*---------------장르 차트---------------*/
	@Override
	public List<MovieDtlRespDto> getGenreAll(String user_id) {
		// TODO Auto-generated method stub
		return movieRepository.getGenreAll(user_id);
	}
	
	

}