package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberServiceInterface {

	@Autowired
	MemberDAOImpl dao;
	
	@Override
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}

	@Override
	public void delete(String _id) {
		dao.delete(_id);
	}

	@Override
	public void update(MemberVO vo) {
		dao.update(vo);
	}

	@Override
	public MemberVO one(String _id) {
		return dao.one(_id);
	}

	@Override
	public List<MemberVO> list() {
		return dao.list();
	}

}
