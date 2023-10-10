package com.acorn.registerPrj;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class R_Service {
	
	@Autowired
	R_DAO dao;
	
	public void registerOne(R_Member member) throws SQLException {
		dao.insertOne(member);
		System.out.println("servie : " + member);
	}
	
	public void deleteOne(String id) throws SQLException {
		System.out.println("service");
		dao.deleteOne(id);
	}
	
	public void UpdateOne(String id) throws SQLException {
		System.out.println("service");
	}
	
	
	
	
}
