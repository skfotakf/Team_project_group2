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

import com.springboot.project.web.dto.movie.MainChartDto;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.web.dto.movie.MovieLikeDto;
import com.springboot.project.web.dto.movie.MovieRatingDto;
/*import com.springboot.project.web.model.vo.MovieVO;*/
/*import com.springboot.project.web.service.MovieRatingService;*/
import com.springboot.project.web.service.MovieService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainChartController {
	
	private final MovieService movieService;
	
	/*
	@Autowired
	private MovieRatingService ratingService;
	*/
	// 메인 페이지 보여주기(chart) - 기본 페이지 R
	@GetMapping("/")
	public String indexRedirectHandler() {
		return "redirect:/chart/boxoffice/1";
	}
	
	@GetMapping("/chart/boxoffice/{code}")
	public String viewMainChart(Model model, @PathVariable int code, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		String user_id="";
		if(principalDetails == null) {
			model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
		} else {
			
			user_id = principalDetails.getUser().getUsername();
			System.out.println(user_id);
			model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
			
		}
		model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
		if(code == 1) {
			return "chart/boxoffice";
		}
		return "movie/list";
	}
	
	@GetMapping("/chart/top/{code}")
	public String viewTopChart(Model model, @PathVariable int code, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		if(code == 1) {
			String user_id="";
			model.addAttribute("nameSortby", 1);
			model.addAttribute("ascDesc", 0);
			if(principalDetails == null) {
				model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
			} else {
				
				user_id = principalDetails.getUser().getUsername();
				System.out.println(user_id);
				model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
				
			}
			model.addAttribute("chartAll", movieService.getChartAll(code, user_id));
			
			return "chart/top";
		} else if(code == 2) {
			String user_id="";
			model.addAttribute("nameSortby", 2);
			model.addAttribute("ascDesc", 0);
			if(principalDetails == null) {
				model.addAttribute("chartAll", movieService.getChartAllRelease(code, user_id));
			} else {
				
				user_id = principalDetails.getUser().getUsername();
				System.out.println(user_id);
				model.addAttribute("chartAll", movieService.getChartAllRelease(code, user_id));
				
			}
			return "chart/top";
		} else if(code == 3) {
			String user_id = "";
			model.addAttribute("nameSortby", 3);
			model.addAttribute("ascDesc", 0);
			if(principalDetails == null) {
				model.addAttribute("chartAll", movieService.getChartAllLike(code, user_id));
			} else {
				model.addAttribute("principalDetails", principalDetails.getUser());
				user_id = principalDetails.getUser().getUsername();
				System.out.println(user_id);
				model.addAttribute("chartAll", movieService.getChartAllLike(code, user_id));
				
			}
			
			return "chart/top";
		}
		
		return "movie/list";
		
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
	@PostMapping("/chart/top/chart-like/plus")
	public Object plusLikeCnt(@RequestBody MovieLikeDto movieLikeDto,  @AuthenticationPrincipal PrincipalDetails principalDetails) {
		System.out.println(movieLikeDto);
		if(principalDetails == null) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("error", "auth");
			return error;
		} else {
		movieLikeDto.setUser_id(principalDetails.getUser().getUsername());
		
		movieService.plusLikeCnt(movieLikeDto);
		return movieLikeDto;
		}
		
	}
	
	@ResponseBody
	@PostMapping("/chart/top/chart-like/minus")
	public Object minusLikeCnt(@RequestBody MovieLikeDto movieLikeDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieLikeDto.setUser_id(principalDetails.getUser().getUsername());
		movieService.minusLikeCnt(movieLikeDto);
		
		
		return movieLikeDto;
		
	}
	
	@ResponseBody
	@PostMapping("/chart/top/chart-rating/insert")
	public Object insertRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieRatingDto.setUser_id(principalDetails.getUser().getUsername());
		movieService.insertRatingCnt(movieRatingDto);
		
		
		return movieRatingDto;
	}

	@ResponseBody
	@PostMapping("/chart/top/chart-rating/update")
	public Object updateRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieRatingDto.setUser_id(principalDetails.getUser().getUsername());
		movieService.updateRatingCnt(movieRatingDto);
		
		
		
		return movieRatingDto;
	}
	
	@ResponseBody
	@PostMapping("/chart/top/chart-rating/delete")
	public Object deleteRatingCnt(@RequestBody MovieRatingDto movieRatingDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		
		movieRatingDto.setUser_id(principalDetails.getUser().getUsername());
		movieService.deleteRatingCnt(movieRatingDto);
		
		
		return movieRatingDto;
	}
	
	
	@GetMapping("/search/genre")
	public String viewGenreSearch(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		String user_id="";
		
		if(principalDetails == null) {
			model.addAttribute("genreAll", movieService.getGenreAll(user_id));
		} else {
			
			user_id = principalDetails.getUser().getUsername();
			
			model.addAttribute("genreAll", movieService.getGenreAll(user_id));
			
		}
		return "search/gnr";
	}
	
}
