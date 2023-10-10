package com.acorn.day1_test.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acorn.day1_test.Calculator;

@Component
public class Program {
	
	@Autowired
	Calculator calculator;
	
	
	public Program() {
	}
	
	// 생성자 주입 constructor injection
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	// 세터주입 setter injection
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int subM(int num1, int num2) {
		int result;
		result = calculator.sub(num1, num2);
		return result;
	}

}
