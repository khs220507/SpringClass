package com.acorn.day1_test.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pController {
	
	@Autowired
	Program  program;
	
	@RequestMapping("/sub")
	public  String test1( int su1,  int su2) {
		int result  = program.subM(su1, su2);
		System.out.println( result);
		return "view";
	}
}
