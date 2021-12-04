package com.springboot.project.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.domain.movie.MovieDtl;
import com.springboot.project.domain.movie.MovieRepository;
import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;

	
	
	@Override // 메인 chart
	public List<MainChartRespDto> getChartAll(int code, String user_id) {
		System.out.println("되는중");
		return movieRepository.getChartAll(code, user_id);
	}
	@Override
	public List<MainChartRespDto> getChartAllRelease(int code, String user_id) {
		
		return movieRepository.getChartAllRelease(code, user_id);
	}
	@Override
	public List<MainChartRespDto> getChartAllLike(int code, String user_id) {

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
	public MovieDtlRespDto getMovieDtl(int mov_idn, int number) {
		
		/*
		MovieDtl movieDtl = new MovieDtl();
		movieDtl.setMov_idn(mov_idn);
		movieDtl.setNumber(number);
		
		MovieDtlRespDto movieDtlRespDto = movieRepository.getMovieDtl(movieDtl).toEntity();
		
		return movieRepository.getMovieDtl(movieDtl).toEntity();
		*/
		return movieRepository.getMovieDtl(mov_idn, number);
		
	}
	@Override
	public MovieDtlRespDto getMovieGenre(int gen_num, String genre) {
		MovieDtl movieDtl = new MovieDtl();
		movieDtl.setMov_gnr1(gen_num);
		movieDtl.setMov_gnr2(gen_num);
		movieDtl.setMov_gnr3(gen_num);
		movieDtl.setGen_num(gen_num);
		movieDtl.setGenre(genre);
		return null;
	}
	
	

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