package com.sbs.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArticleController {
	@RequestMapping("/article/list")
	public String showList() {
		return "article/list";
	}
} 