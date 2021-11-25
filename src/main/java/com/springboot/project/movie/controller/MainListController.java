package com.springboot.project.movie.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.project.movie.model.dto.MovieListDto;
import com.springboot.project.movie.service.MovieListService;

@Controller
@RequestMapping("movie")
public class MainListController {
	
	@Autowired
	private MovieListService movieService;
	
	// 메인 페이지 보여주기(list) - 기본 페이지 R
	@GetMapping("list")
	public String viewMainList(Model model) throws Exception {
		
		model.addAttribute("listAll", movieService.listAll());
		
		return "/movie/list";
	}
	
	
	
	
}
