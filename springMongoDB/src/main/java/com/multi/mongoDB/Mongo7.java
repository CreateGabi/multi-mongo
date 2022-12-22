package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class Mongo7 {

	public static void main(String[] args) {
		try {
			// 1. 몽고DB에 연결
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop2 db에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. member collection에 연결
			MongoCollection<Document> collection = database.getCollection("member");
			
			// 4. crud(updateOne(document)
			// 업데이트할 조건
			Document filter = new Document();
			filter.append("id", "apple3");
			filter.append("pw", "1234");
			// 업데이트할 내용
			Bson update = Updates.set("name", "finalWIN");
			
			collection.updateOne(filter, update);
			client.close();
			System.out.println("===== updateOne 성공 =====");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
