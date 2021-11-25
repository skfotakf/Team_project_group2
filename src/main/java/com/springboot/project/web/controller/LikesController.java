package com.springboot.project.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.web.model.vo.MovieVO;
import com.springboot.project.web.service.MovieLikesService;
import com.springboot.project.web.model.vo.MovieLikeVO;

@Controller
@RequestMapping("movie")
public class LikesController {

	@Autowired
	private MovieLikesService likesService;
	
	@GetMapping("like")
	public void read(@RequestParam("mov_idn") int mov_idn, Model model,
							@ModelAttribute MovieVO vo,
							HttpServletRequest httpreque) throws Exception {
		
		likesService.insertListLike(vo);
		//model.addAttribute(likesService.)
		
		int user_number = ((MovieVO) httpreque.getSession().getAttribute(null)).getNumber();
		
		MovieLikeVO vo2 = new MovieLikeVO();
		vo2.setMov_idn(mov_idn);
		vo2.setNumber(user_number);
		
		int movieLike = likesService.getListLike(vo);
		System.out.println(movieLike);				
		
		model.addAttribute("heart", movieLike);
		
	}
	
	@ResponseBody
    @PostMapping(value = "/heart", produces = "application/json")
    public int heart(HttpServletRequest httpRequest) throws Exception {

        int heart = Integer.parseInt(httpRequest.getParameter("heart"));
        int mov_idn = Integer.parseInt(httpRequest.getParameter("mov_idn"));
        int number = ((MovieVO) httpRequest.getSession().getAttribute(null)).getNumber();

        MovieLikeVO vo = new MovieLikeVO();

        vo.setMov_idn(mov_idn);
        vo.setNumber(number);

        System.out.println(heart);

        if(heart >= 1) {
            likesService.deleteListLike(vo);
            heart=0;
        } else {
        	likesService.insertListLike(vo);
            heart=1;
        }

        return heart;

    }
	
	
}
