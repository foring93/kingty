package com.naver.git.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@GetMapping("/go.net")
	public String go () {
		return "okGo";
	}
}
