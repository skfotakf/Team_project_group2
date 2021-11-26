package com.springboot.project.movie.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.springboot.project.movie.model.dto.MovieListDto;
import com.springboot.project.movie.service.MovieListService;


@RestController
@RequestMapping("movie")
public class MainListLikeRestController {

	@Autowired
	private MovieListService listService;
	
	
	@GetMapping("like/like.do")
	public String like(MovieListDto movieListDto) {  // get이 일어나면 좋아요 처리  
		
		
		
		return "";
	}
	
	
	
	/*
	@PutMapping("/list/like-update/{mov-idn}") // 영화 코드를 올려준다.
	public String movieLikeData(@PathVariable int mov_idn, MovieVO vo) {
		
		// put요청으로 어던것을 전달할건지?? -> 전체 영화 리스트에서 / 어떤 회원 코드가 / 어떤 영화 코드를 / 좋아요 눌렀는지
		
		List<MovieVO> movie_list = listService.listAll(); // 전체 영화 리스트에서 전체 불러온다.
		int user_code = vo.getNumber(); // 어떤 회원 코드가
		int movie_code = vo.getMov_idn(); // 어떤 영화 코드를?
		
		// 유저 코드가 존재하지 않는다는 것은 로그아웃 상태
		if(user_code == 0) {
			 
		}
		return "";
	}
    */
    
}
