package com.multi.mongoDB;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Mongo10 {

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
			doc.append("age", 501);
			doc.append("name", "song2");
			doc.append("office", "busan");
			doc.append("phone", "011");
			
			Document doc2 = new Document();
			doc2.append("age", 502);
			doc2.append("name", "song3");
			doc2.append("office", "seoul");
			doc2.append("phone", "011");
			
			Document doc3 = new Document();
			doc3.append("age", 503);
			doc3.append("name", "song4");
			doc3.append("office", "busan");
			doc3.append("phone", "011");
			
			ArrayList<Document> list = new ArrayList<Document>();
			list.add(doc);
			list.add(doc2);
			list.add(doc3);
			
			collection.insertMany(list);
			client.close();
			
			System.out.println("===== insertMany 성공 =====");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
