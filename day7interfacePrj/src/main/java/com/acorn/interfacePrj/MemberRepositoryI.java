package com.acorn.interfacePrj;

import java.util.List;

public interface MemberRepositoryI {

	public int  insert( Member member);
	public List<Member>  selectAll();
	public int  update( Member member);
	public int  delete(String userId); 
	


}
