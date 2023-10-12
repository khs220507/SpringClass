package com.acron.day5.ex;

public class ExceptionTest0 {
	
	public static void main(String[] args) {
		ExceptionTest0 ex = new ExceptionTest0();
		try {
			ex.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}
	
	public void method() throws Exception {
		try {
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("예외상황인식적절코드");
			throw ex;
		}
	}
}
