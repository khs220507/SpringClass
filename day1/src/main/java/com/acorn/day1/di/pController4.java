package com.acorn.day1.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pController4 {

	
	@GetMapping("/AA")
	public String test() {
		System.out.println("controller 테스트");
		return "test";
	}
	
}
