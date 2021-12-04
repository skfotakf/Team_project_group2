package com.springboot.project.web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.project.config.auth.PrincipalDetails;

@Controller
public class LikelistController {

	@GetMapping("/user/likelist")
	public String viewLikelist(Model model, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		int number = 0;
		
		if(principalDetails == null) {
			return "auth/signin";
		} else {
			number = principalDetails.getUser().getNumber();
			
			model.addAttribute("likelistAll", movieService.getLikelistAll(number));
			return "user/likelist";
		}
		
	}
}
