package com.springboot.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {
	
	@GetMapping("/list/list")
	public String index() {
		return "list/list";
	}
}
