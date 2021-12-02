package com.springboot.project.web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.domain.movie.MovieDtl;
import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MovieController {
	
	private final MovieService movieService;
	
	@GetMapping("/title/{mov_idn}")
	public String MovieDtlForm(Model model, @PathVariable int mov_idn, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		model.addAttribute("movie_dtl", movieService.getMovieDtl(mov_idn, principalDetails.getUser().getNumber()));
		
		return "movie/movieDtl";
	}
}
