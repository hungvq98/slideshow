package com.slideshow.slide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class home {
	@RequestMapping("/index")
	public String Index() {
		return "index";
	}
	
}


