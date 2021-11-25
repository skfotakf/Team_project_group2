package com.springboot.project.web.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.web.mapper.MovieRatingDAO;
import com.springboot.project.web.model.dto.MovieRatingDto;
import com.springboot.project.web.model.vo.MovieVO;

@Service
public class MovieRatingServiceImpl implements MovieRatingService {
	
	@Autowired
	private MovieRatingDAO movieRatingDAO;

	@Override
	public List<MovieRatingDto> getMovieList() {
		return movieRatingDAO.getMovieList();
	}

	@Override
	public boolean ratingCheck(MovieVO movieVO, HttpSession session) {
		
		boolean result = movieRatingDAO.ratingCheck(movieVO);
		if(result) { //true일 경우 session 등록
			MovieVO movieVO2 =  memberRatingCheck(movieVO);
			// 세션 변수 등록
			session.setAttribute("mov_idn", movieVO2.getMov_idn());
			session.setAttribute("number", movieVO2.getNumber());
		}
		
		return result;
	}

	// 영화 평가 정보를 담는다.
	@Override
	public MovieVO memberRatingCheck(MovieVO movieVO) {
		return movieRatingDAO.memberRatingCheck(movieVO);
	}

	
	
}