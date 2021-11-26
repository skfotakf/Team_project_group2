package com.springboot.project.movie.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.movie.mapper.MovieListDAO;
import com.springboot.project.movie.model.dto.LikeUpdateDto;
import com.springboot.project.movie.model.dto.MovieListDto;
import com.springboot.project.movie.model.vo.MovieVO;

@Service
public class MovieListServiceImpl implements MovieListService {

	@Autowired
	private MovieListDAO movieListDAO;

	@Override // 메인 list
	public List<MovieVO> listAll() {
		return movieListDAO.listAll();
	}

	@Override
	public int likeLoginCheck(MovieVO movieVO) {
		return movieListDAO.likeLoginCheck(movieVO);
	}

	@Override
	public int likeCheck(LikeUpdateDto likeUpdateDto) {
		MovieListDto movieListDto = new MovieListDto();
		movieListDto.setMov_lik(likeUpdateDto.getMov_lik());
		movieListDto.setMov_lik_cnt(likeUpdateDto.getMov_lik_cnt());

		int result = movieListDAO.likeCheck(likeUpdateDto);

		return 0;

	}

	@Override
	public int likeCheckCancel(LikeUpdateDto likeUpdateDto) {
		return movieListDAO.likeCheckCancel(likeUpdateDto);
	}

}
