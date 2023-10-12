package com.acron.day5.ex;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;

public class ExceptionCatcher {
	
	@RequestMapping("/db")
	public String method1() {
		String view="view1";
		try {
			throw new SQLException();
		} catch (SQLException ex) {
			view="err";
		}
		return view;
	}

}
