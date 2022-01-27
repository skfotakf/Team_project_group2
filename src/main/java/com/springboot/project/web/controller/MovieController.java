package com.springboot.project.web.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.web.dto.movie.MovieReviewDto;
import com.springboot.project.web.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MovieController {
	
	private final MovieService movieService;
	
	@GetMapping("/title/{mov_idn}")
	public String MovieDtlForm(Model model, @PathVariable int mov_idn,  @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		// model.addAttribute("movie_dtl", movieService.getMovieDtl(mov_idn, principalDetails.getUser().getNumber()));
		
		int number = 0;
		
		if(principalDetails == null) {
			model.addAttribute("movie_dtl", movieService.getMovieDtl(mov_idn, number));
			
		} else {
			number=principalDetails.getUser().getNumber();
			model.addAttribute("movie_dtl", movieService.getMovieDtl(mov_idn, number));
		}
		model.addAttribute("movie_review",movieService.listReview(mov_idn));
		
		return "movie/movieDtl";
	}
	
	@GetMapping("/actor")
	public String ActorDtlForm(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		
		return "movie/actorDtl";
	}
	
	
	@GetMapping("/user/likelist")
	public String viewLikelist(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		int number = 0;
		
		if(principalDetails == null) {
			return "auth/signin";
		} else {
			number = principalDetails.getUser().getNumber();
			model.addAttribute("likelistAll", movieService.getMovieLike(number));
			return "movie/likelist";
		}
	}
	
	//댓글
	@ResponseBody
	@PostMapping("/title/{mov_idn}")
	public Object InsertForm(@RequestBody MovieReviewDto movieReviewDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		if(principalDetails == null) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("error", "auth");
			return error;
		}
		else {
		movieReviewDto.setNumber(principalDetails.getUser().getNumber());
		movieService.insertReview(movieReviewDto);
		
		
		return movieReviewDto;
		}
	}
	
	
}
