package com.springboot.project.movie.controller;


import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.project.movie.service.MovieListService;

@Controller
@RequestMapping("movie")
public class MainListController {
	
	@Autowired
	private MovieListService movieService;
	
	@GetMapping("/list/{page}")
	public ModelAndView noticeIndex() {
		/*
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("user_email")) {
					HttpSession session = request.getSession();
					UserDto userDto = userService.getUser(c.getValue());
					session.setAttribute("login_user", userDto);
				}
			}
		}   추후 유저정보 받기
		*/
		ModelAndView mav = new ModelAndView("리스트 페이지 주소");
		mav.addObject("movieList", movieService.listAll());
		return mav;
	}
	
	@GetMapping("/insert")
	public String noticeInsertIndex(Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("login_user") == null) {
			return "redirect:/sign-in";
		}
		
		Date date = new Date();
		model.addAttribute("now", date);
		return "notice/notice_insert";
	}
	
	
	
	
}
