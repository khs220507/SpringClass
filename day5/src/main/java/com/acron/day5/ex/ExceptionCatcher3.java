package com.acron.day5.ex;

import java.sql.SQLException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

public class ExceptionCatcher3 {
	
	@ExceptionHandler(SQLException.class)
	public String catcher1(SQLException ex, Model model) {
		model.addAttribute("ex",ex);
		return "err2";
	}
	
	
	@RequestMapping("/db2")
	public String method1() throws SQLException {
	throw new SQLException();
	}
	
	@RequestMapping("/db3")
	public String method2() throws SQLException {
	throw new SQLException();
	}
}
