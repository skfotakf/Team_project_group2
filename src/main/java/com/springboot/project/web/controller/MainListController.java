package com.springboot.project.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.project.web.model.vo.MovieVO;
import com.springboot.project.web.service.MovieRatingService;
import com.springboot.project.web.service.MovieService;

@Controller
@RequestMapping("movie")
public class MainListController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieRatingService ratingService;
	
	// 메인 페이지 보여주기(list) - 기본 페이지 R
	@GetMapping("list")
	public String viewMainList(Model model) throws Exception {
		
		model.addAttribute("listAll", movieService.listAll());
		
		return "/movie/list";
	}
	
	// 별 평가 처리
	@RequestMapping("ratingCheck.do")
	public ModelAndView ratingCheck(@ModelAttribute MovieVO vo, HttpSession session) {
		
		boolean result = ratingService.ratingCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result == true) { 
			// 유저가 평가 체크 했다면
			mav.addObject("msg", "이미 평가 하셨습니다.");
			// 취소 할 수 있도록
			
		} else { 
			// 평가를 안했다면
			mav.addObject("msg", "평가 해주셔서 감사합니다.");
			// 단순 클릭시 ->seem
			
			// 별 점수 확인후 값 넘겨주기
		}
		
		return mav;
	}
	
	
	
}
