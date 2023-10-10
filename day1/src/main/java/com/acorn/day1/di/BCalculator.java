package com.acorn.day1.di;

import org.springframework.stereotype.Component;

@Component
public class BCalculator  implements Calculator{

	@Override
	public int add(int su1, int su2) {
		 System.out.println("B calculator");
		return su1+su2;
	}
}
