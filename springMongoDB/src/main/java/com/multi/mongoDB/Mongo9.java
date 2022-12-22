package com.multi.mongoDB;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo9 {

	public static void main(String[] args) {
		try {
			// 1. 몽고DB에 연결
			MongoClient client = new MongoClient("localhost", 27017);
			
			// 2. shop2 db에 연결
			MongoDatabase database = client.getDatabase("shop2");
			
			// 3. member collection에 연결
			MongoCollection<Document> collection = database.getCollection("memo");
			
			// 4. crud(insertOne(document)	
			Document doc = new Document();
			doc.append("age", 500);
			doc.append("name", "song");
			doc.append("office", "busan");
			doc.append("phone", "011");
			
			collection.insertOne(doc);
			client.close();
			System.out.println("===== insertOne 성공 =====");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
