package com.acorn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	@Autowired
	MyRepository repository;
	@Autowired
	GoogleApi api;
	
	// Member m
	public void userRegister(String id, String pw) {
		// 회원가입
		double[] result = api.위도경도구하기();
		repository.insertMember(id, pw, String.valueOf(result[0]), String.valueOf(result[1]));
	}

}
