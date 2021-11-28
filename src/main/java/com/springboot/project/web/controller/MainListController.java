package com.springboot.project.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*import com.springboot.project.web.model.vo.MovieVO;*/
/*import com.springboot.project.web.service.MovieRatingService;*/
import com.springboot.project.web.service.MovieService;

@Controller
@RequestMapping("/list")
public class MainListController {
	
	@Autowired
	private MovieService movieService;
	/*
	@Autowired
	private MovieRatingService ratingService;
	*/
	// 메인 페이지 보여주기(list) - 기본 페이지 R
	@GetMapping("/list")
	public String viewMainList(Model model, @PathVariable int code) {
		
		model.addAttribute("listAll", movieService.getListAll(code));
		
		return "list/list";
	}
	
	@GetMapping("/top/{code}")
	public String viewTopList(Model model, @PathVariable int code) {
		
		if(code == 1) {
			model.addAttribute("nameSortby", 1);
			model.addAttribute("ascDesc", 0);
			model.addAttribute("listAll", movieService.getListAll(code));
			
			return "list/top";
		} else if(code == 2) {
			model.addAttribute("nameSortby", 2);
			model.addAttribute("ascDesc", 0);
			model.addAttribute("listAll", movieService.getListAllRelease(code));
		
			return "list/top";
		} else if(code == 3) {
			model.addAttribute("nameSortby", 3);
			model.addAttribute("listAll", movieService.getListAllLike(code));
			
			return "list/top";
		}
		
		return "movie/list";
		
	}
	/* 정배열 역배열 버튼(못넣음)
	@GetMapping("/top/{code}/desc")
	public String viewMainListDesc(Model model, @PathVariable int code) {
		
		if(code == 1) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("listAll", movieService.getListAllDesc(code));
			
			return "list/top";
		} else if(code == 2) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("listAll", movieService.getListAllDesc(code));
		
			return "list/top";
		} else if(code == 3) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("listAll", movieService.getListAllLikeDesc(code));
			
			return "list/top";
		}
		
		return "movie/list";
	}
	*/
	/*
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
	
	*/
	
}
