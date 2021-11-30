package com.springboot.project.web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.project.config.auth.PrincipalDetails;

@Controller
public class ListController {
	
	@GetMapping("/list/list")
	public String index(@AuthenticationPrincipal PrincipalDetails principalDetails) {
		System.out.println(principalDetails.getUser());
		return "list/list";
	}
}
