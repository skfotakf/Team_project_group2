package com.springboot.project.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.project.config.auth.PrincipalDetails;
import com.springboot.project.web.dto.movie.MainChartDto;
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
	@GetMapping("/chart/boxoffice/{code}")
	public String viewMainChart(Model model, @PathVariable int code) {
		
		model.addAttribute("chartAll", movieService.getChartAll(code));
		if(code == 1) {
			return "chart/boxoffice";
		}
		return "movie/list";
	}
	
	@GetMapping("/chart/top/{code}")
	public String viewTopChart(Model model, @PathVariable int code) {
		
		if(code == 1) {
			model.addAttribute("nameSortby", 1);
			model.addAttribute("ascDesc", 0);
			
			model.addAttribute("chartAll", movieService.getChartAll(code));
			
			return "chart/top";
		} else if(code == 2) {
			model.addAttribute("nameSortby", 2);
			model.addAttribute("ascDesc", 0);
			
			model.addAttribute("chartAll", movieService.getChartAllRelease(code));
		
			return "chart/top";
		} else if(code == 3) {
			model.addAttribute("nameSortby", 3);
			
			model.addAttribute("chartAll", movieService.getChartAllLike(code));
			
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
	public Object plusLikeCnt(@RequestBody MovieLikeDto movieLikeDto) {
		
		movieLikeDto.setUser_id("gyu12");
		movieService.plusLikeCnt(movieLikeDto);
		
		
		System.out.println(movieLikeDto);
		
		return movieLikeDto;
	}
	
	@ResponseBody
	@PostMapping("/chart/top/chart-like/minus")
	public Object minusLikeCnt(@RequestBody MovieLikeDto movieLikeDto) {
		
		movieLikeDto.setUser_id("gyu12");
		movieService.minusLikeCnt(movieLikeDto);
		
		
		System.out.println(movieLikeDto);
		
		return movieLikeDto;
	}
	
	@ResponseBody
	@PostMapping("/chart/top/chart-rating/insert")
	public Object insertRatingCnt(@RequestBody MovieRatingDto movieRatingDto) {
		
		movieRatingDto.setUser_id("gyu12");
		movieService.insertRatingCnt(movieRatingDto);
		
		
		System.out.println(movieRatingDto);
		
		return movieRatingDto;
	}

	@ResponseBody
	@PostMapping("/chart/top/chart-rating/update")
	public Object updateRatingCnt(@RequestBody MovieRatingDto movieRatingDto) {
		
		movieRatingDto.setUser_id("gyu12");
		movieService.updateRatingCnt(movieRatingDto);
		
		if(movieRatingDto.getRating() == 0) {
			System.out.println("된다!");
		} else {
			System.out.println("안된다!");
		}
		System.out.println(movieRatingDto);
		
		return movieRatingDto;
	}
	
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
