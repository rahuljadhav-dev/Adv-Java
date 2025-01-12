package com.example.mongo.com.example.mongo.model;

import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "StudentsInfo")
@Data
public class Students {
	private int id;
	private String name;
	private int roll;

}
