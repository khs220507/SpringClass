package com.acorn.day1.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramTest4 {
public static void main(String[] args) {
	ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/day1/di/setting.xml");
	Program program = ac.getBean(Program.class);
	int result = program.addP(10,50);
	System.out.println(result);
	
}
}
