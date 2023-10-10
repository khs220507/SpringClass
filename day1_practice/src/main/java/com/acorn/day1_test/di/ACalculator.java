package com.acorn.day1_test.di;

import org.springframework.stereotype.Component;

import com.acorn.day1_test.Calculator;


@Component
public class ACalculator implements Calculator{

	@Override
	public int sub(int num1, int num2) {
		System.out.println("A Calculator");
		return num1-num2;
	}
	
}
