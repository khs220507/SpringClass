package com.acorn.mybatisPractice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
@Log4j
public class MemberRepositoryTest {

	@Autowired
	MemberRepository dao;
	
	@Test
	public void test() {
		log.info(dao.selectAll().size());
	}
	
	@Test
	public void test2() {
		log.info(dao.select("test1"));
	}
	
	@Test
	public void test3() {
		try {
			Member m = new Member();
			m.setId("test999");
			m.setPwd("999");
			m.setName("김구구");
			dao.insert(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test4() {
		Member m = new Member();
		m.setId("test999");
		m.setPwd("new");
		m.setName("new");
		dao.update(m);
	}


}
