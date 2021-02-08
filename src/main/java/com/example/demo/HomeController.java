package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/move/quiz")
	public String quiz() {
		return "uss:qna/quiz";
	}
	@GetMapping("/move/student")
	public String student() {
		return "uss:stu/student";
	}
	
}
