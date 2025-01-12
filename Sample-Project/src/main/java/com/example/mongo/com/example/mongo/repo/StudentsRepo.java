package com.example.mongo.com.example.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.com.example.mongo.model.Students;

public interface StudentsRepo extends MongoRepository<Students, Integer>{

}
