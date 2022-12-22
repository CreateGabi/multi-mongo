package com.multi.mongoDB;

import java.util.List;

public interface MemberServiceInterface {

	public void insert(MemberVO vo);
	
	public void delete(String _id);
	
	public void update(MemberVO vo);
	
	public MemberVO one(String _id);
	
	public List<MemberVO> list();
}
