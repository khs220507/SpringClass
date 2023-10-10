package com.acorn.day1.di;

public class ProgramTest3 {
	public static void main(String[] args) {
		
	Calculator calculator = new Ccalculator();
	Program program = new Program(calculator);
	int result = program.addP(10, 20);
	System.out.println(result);
	}
	

}
