package com.springboot.project.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.springboot.project.domain.movie.Movie;
import com.springboot.project.domain.movie.MovieRepository;
import com.springboot.project.web.dto.movie.MainChartRespDto;
import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;
import com.springboot.project.web.model.MovieBean;
import com.springboot.project.web.dto.movie.MovieReviewDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;
	
	private MovieBean movieBean;
	
	@Override // 메인 chart
	public List<MainChartRespDto> getChartAll(int number) {
		System.out.println("되는중");
		return movieRepository.getChartAll(number);
	}
	
	@Override // top 20 chart
	public List<MainChartRespDto> getChartAllTop(int code, int page, int number) {
		movieBean = new MovieBean();
		
		Movie movieEntity = new Movie();
		movieEntity.setNumber(number);
		movieEntity.setSortCode(code);
		
		List<MainChartRespDto> topListAll = movieRepository.getChartAllTop(movieEntity);
		
		movieBean.setPageNumber(page);
		movieBean.setmovieTotalCount(topListAll.size());
		movieBean.setStartIndex();
		movieBean.setEndIndex();
		movieBean.setTotalPage();
		movieBean.setStartPage();
		movieBean.setEndPage();
		
		List<MainChartRespDto> topList = new ArrayList<MainChartRespDto>();
		
		for(int i = movieBean.getStartIndex(); i < movieBean.getEndIndex() && i < movieBean.getmovieTotalCount(); i++) {
			topList.add(topListAll.get(i));
		}
		
		return topList;
	}
	
	@Override
	public List<MainChartRespDto> getChartAllRelease(int code, int number) {
		
		return movieRepository.getChartAllRelease(code, number);
	}
	@Override
	public List<MainChartRespDto> getChartAllLike(int code, int number) {

		return movieRepository.getChartAllLike(code, number);
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
	
	/*
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
	*/
	

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
	public List<MovieDtlRespDto> getGenreAll(int number) {
		// TODO Auto-generated method stub
		return movieRepository.getGenreAll(number);
	}
	
	@Override
	public List<MovieDtlRespDto> getGenre(int code, int number) {
		// TODO Auto-generated method stub
		return  movieRepository.getGenre(code, number);
	}
	/*--------------검색--------------*/
	

	@Override
	public List<MovieDtlRespDto> movieFind(String findValue) {
		
		return movieRepository.movieFind(findValue);
	}
	@Override
	public List<MovieDtlRespDto> movieActorFind(String findValue) {
		return movieRepository.movieActorFind(findValue);
	}

	
	
	@Override
	public List<MovieDtlRespDto> getMovieLike(int number) {
		return movieRepository.getMovieLike(number);
	}
	
	/* ----------------- 페이징 ---------------*/
	
	public void setMovieBean(int pageNumber) {
		MovieBean movieBean = new MovieBean();
		//movieBean.setmovieTotalCount(movieListAll.size());
		movieBean.setPageNumber(pageNumber);
		movieBean.setStartIndex();
		movieBean.setEndIndex();
		movieBean.setTotalPage();
		movieBean.setStartPage();
		movieBean.setEndPage();
	}
	
	@Override
	public int parseIntPageNumber(String pageNumber) {
		return Integer.parseInt(pageNumber);
	}
	
	@Override
	public List<MainChartRespDto> getMovieList(int pageNumber) {
		/*
		movieListAll = getMovieListAll();
		List<MainChartRespDto> movieList = new ArrayList<MainChartRespDto>();
		
		setMovieBean(pageNumber);
		
		for(int i = movieBean.getStartIndex(); i < movieBean.getEndIndex() && i < movieBean.getMovieTotalCount(); i++) {
			movieList.add(movieListAll.get(i));
		}
		*/
		return null;
	}
	
	@Override
	public List<MovieReviewDto> listReview(int mov_idn) {
		return movieRepository.listReview(mov_idn);
	}
	
	
	
	/*댓글 기능*/
	@Override
	public int insertReview(MovieReviewDto movieReviewDto) {
		
		return movieRepository.insertReview(movieReviewDto);
	}

	

}