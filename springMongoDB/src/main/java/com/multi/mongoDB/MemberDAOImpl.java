package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAOInterface {

	@Autowired
	MongoTemplate mongo;
	
	@Override
	public void insert(MemberVO vo) {
		mongo.insert(vo, "member");
	}

	@Override
	public void delete(String _id) {
		Query query = new Query(new Criteria("_id").is(_id));
		mongo.remove(query, "member");
	}

	@Override
	public void update(MemberVO vo) {
		Query query = new Query(new Criteria("_id").is(vo.get_id()));
		Update update = new Update();
		update.set("tel", vo.getTel());
		mongo.updateMulti(query, update, MemberVO.class, "member");
	}

	@Override
	public MemberVO one(String _id) {
		return mongo.findById(_id, MemberVO.class, "member");
	}

	@Override
	public List<MemberVO> list() {
		Query query = new Query();
		return mongo.find(query, MemberVO.class, "member");
	}

}
