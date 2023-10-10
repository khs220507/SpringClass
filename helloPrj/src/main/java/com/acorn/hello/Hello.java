package com.acorn.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



//매서드 단위 매핑
@Controller
public class Hello {
	
	
	
	@RequestMapping("/hello")
	public String hello( Model model) {
		model.addAttribute("message", "l like spring");
		return "hello";   //view 
	}
	
	

}

 