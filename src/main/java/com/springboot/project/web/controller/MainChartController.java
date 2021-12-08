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

import com.springboot.project.web.dto.movie.MovieDtlRespDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.web.dto.movie.MovieRatingDto;
import com.springboot.project.web.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainChartController {
	
	private final MovieService movieService;
	
	// 메인 페이지 보여주기(chart) - 기본 페이지 R
	@GetMapping("/")
	public String indexRedirectHandler() {
		return "redirect:/chart/boxoffice/1";
	}
	
	@GetMapping("/chart/boxoffice")
	public String viewMainChart(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		int number= 0;
		if(principalDetails == null) {
			model.addAttribute("chartAllTop", movieService.getChartAll(number));
		} else {
			
			number = principalDetails.getUser().getNumber();
			System.out.println(number);
			model.addAttribute("chartAllTop", movieService.getChartAll(number));
			
		}
		
		return "chart/boxoffice";
	}
	
	@GetMapping("/chart/top/{code}/{page}")
	public String viewTopChart(Model model, @PathVariable int code, @PathVariable int page, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		model.addAttribute("nameSortby", code);
		model.addAttribute("page",page);
		model.addAttribute("chartAllTop", movieService.getChartAllTop(code, page, principalDetails == null ? 0 : principalDetails.getUser().getNumber()));
		
		return "chart/top";
		
	}
	/* 정배열 역배열 버튼(못넣음)
	@GetMapping("/top/{code}/desc")
	public String viewMainChartDesc(Model model, @PathVariable int code) {
		
		if(code == 1) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("chartAll", movieService.getChartAllDesc(code));
			
			return "chart/top";
		} else if(code == 2) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("chartAll", movieService.getChartAllDesc(code));
		
			return "chart/top";
		} else if(code == 3) {
			model.addAttribute("ascDesc", 1);
			model.addAttribute("listAll", movieService.getChartAllLikeDesc(code));
			
			return "chart/top";
		}
		
		return "movie/list";
	}
	*/
	@ResponseBody
	@PostMapping("/chart-like/plus")
	public Object plusLikeCnt(@RequestBody MovieLikeDto movieLikeDto,  @AuthenticationPrincipal PrincipalDetails principalDetails) {
		System.out.println(movieLikeDto);
		if(principalDetails == null) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("error", "auth");
			return error;
		} else {
		movieLikeDto.setNumber(principalDetails.getUser().getNumber());
		
		movieService.plusLikeCnt(movieLikeDto);
		return movieLikeDto;
		}
		
	}
	
	@ResponseBody
	@PostMapping("/chart-like/minus")
	public Object minusLikeCnt(@RequestBody MovieLikeDto movieLikeDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieLikeDto.setNumber(principalDetails.getUser().getNumber());
		movieService.minusLikeCnt(movieLikeDto);
		
		
		return movieLikeDto;
		
	}
	
	@ResponseBody
	@PostMapping("/chart-rating/insert")
	public Object insertRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		if(principalDetails == null) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("error", "auth");
			return error;
		} else {
		movieRatingDto.setNumber(principalDetails.getUser().getNumber());
		movieService.insertRatingCnt(movieRatingDto);
		
		
		return movieRatingDto;
		}
	}

	@ResponseBody
	@PostMapping("/chart-rating/update")
	public Object updateRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieRatingDto.setNumber(principalDetails.getUser().getNumber());
		movieService.updateRatingCnt(movieRatingDto);

		return movieRatingDto;
	}
	
	@ResponseBody
	@PostMapping("/chart-rating/delete")
	public Object deleteRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieRatingDto.setNumber(principalDetails.getUser().getNumber());
		movieService.deleteRatingCnt(movieRatingDto);
		
		
		return movieRatingDto;
	}
	
	
	@GetMapping("/search/genre/{code}")
	public String viewGenreSearch(Model model, @PathVariable int code, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		int number= 0;
		
		if(principalDetails == null) {
			model.addAttribute("genreAll", movieService.getGenre(code, number));
		} else {
			
			number = principalDetails.getUser().getNumber();
			
			model.addAttribute("genreAll", movieService.getGenre(code, number));
			System.out.println(movieService.getGenre(code, number));
		}
		return "search/gnr";
	}
	
	
	@GetMapping("/find")
	public String viewMovieFind(Model model, String findValue, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		MovieDtlRespDto movieDtlRespDto = new MovieDtlRespDto();
		
		model.addAttribute("findValue", findValue);		
		if(findValue == "") {
			return "find/findNo";
		}
		model.addAttribute("findMovie", movieService.movieFind(findValue));
		model.addAttribute("findActorMovie", movieService.movieActorFind(findValue));
		System.out.println(movieService.movieFind(findValue));
		
		return "find/find";
	}
	
	
	
	
}
