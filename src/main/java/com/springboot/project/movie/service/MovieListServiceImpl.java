package com.springboot.project.movie.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.movie.mapper.MovieListDAO;
import com.springboot.project.movie.model.dto.MovieListDto;
import com.springboot.project.movie.model.vo.MovieVO;

@Service
public class MovieListServiceImpl implements MovieListService{
	
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
	public int like_check(String number, String mov_idn) {
		movieListDAO.like_check(Integer.parseInt(number), Integer.parseInt(mov_idn));
	}
	
	@Override
	public void like_check_cancel(String number, String mov_idn) {
		movieListDAO.like_check_cancel(Integer.parseInt(number), Integer.parseInt(mov_idn));
	}

	


}
