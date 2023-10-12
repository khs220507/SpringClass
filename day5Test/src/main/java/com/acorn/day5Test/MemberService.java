package com.acorn.day5Test;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	
	public ArrayList<Member> getMemberList(){
		return dao.select();
	}

}
