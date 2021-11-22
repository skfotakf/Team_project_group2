package com.springboot.project.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.project.movie.commons.paging.Criteria;
import com.springboot.project.movie.commons.paging.PageMaker;
import com.springboot.project.movie.domain.MovieVO;
import com.springboot.project.movie.service.MovieService;

@Controller
@RequestMapping("movie")
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private MovieService movieService;
	
	// 등록 페이지 이동
	@GetMapping("write")
	public String writeGet() {
		
		logger.info("write Get...");
		
		return "/movie/write";
	}
	
	// 등록 처리
	@PostMapping("write")
	public String writePost(MovieVO movieVO, RedirectAttributes redirectAttributes) throws Exception {
		
		logger.info("write Post...");
		logger.info(movieService.toString());
		movieService.create(movieVO);
		// 등록 완료되면 메세지
		redirectAttributes.addFlashAttribute("msg", "등록이 완료되었습니다.");
		
		return "redirect:/movie/list";
	}
	
	// 메인 페이지 보여주기(list) - 기본 페이지 R
	@GetMapping("list")
	public String mainListGet(Model model) throws Exception {
		
		logger.info("open movie List...");
		
		model.addAttribute("movieList", movieService.listAll());
		
		return "/movie/list";
	}
	
	@RequestMapping("movie/contentLike.do")
	public String contentLike(@RequestParam int movie_no, RedirectAttributes redirectAttributes) throws Exception {
		
		logger.info("cilck like button...");
		
		movieService.contentLike(movie_no);
		
		// 페이지값을 그대로 넘겨받기 우해 포워딩을 사용 -> 컨트롤러로 리턴
		return "forward:/movie/list";
		
	}
	
	
	
	
}
