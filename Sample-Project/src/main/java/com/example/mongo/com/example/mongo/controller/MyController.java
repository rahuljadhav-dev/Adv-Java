package com.example.mongo.com.example.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.com.example.mongo.model.Students;
import com.example.mongo.com.example.mongo.repo.StudentsRepo;
import com.example.mongo.com.example.mongo.service.StudentsService;
//import com.example.mongo.com.example.mongo.service.StudentService;

@RestController
@RequestMapping("/students")
public class MyController {

	@Autowired
	private StudentsService service;


	@PostMapping("/insert")
	public ResponseEntity<Students> insert(@RequestBody Students students){
		service.saveStudents(students);
		return ResponseEntity.ok(students);
	}

	@GetMapping("/read")
	public List<Students> read(){
		return service.findStudents();
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteStudentByID(id);


	}

	@PutMapping("/update/{id}")
	public String update(@PathVariable int id, @RequestBody Students s) {

		return service.updateStudentById(id,s);

	}





}
