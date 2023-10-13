package com.acorn.mybatisPractice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberRepository {
	
	@Autowired
	private SqlSession session;
    private static String namespace = "com.acorn.MemberMapper.";
    
    public List<Member> selectAll(){
    	return session.selectList(namespace + "selectAll");
    }
    
    public Member select(String id) {
    	return session.selectOne(namespace+ "selectOne", id);
    }
    
    public int insert(Member dto) {
    	return session.insert(namespace + "insert", dto);
    }
    
    public int update(Member dto) {
    	return session.update(namespace + "update", dto);
    }
    
    
}
