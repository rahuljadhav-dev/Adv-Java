package com.example.mongo.com.example.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.com.example.mongo.model.Students;
import com.example.mongo.com.example.mongo.repo.StudentsRepo;

@Service
public class StudentsService {
	@Autowired
	private final StudentsRepo repo = null;

	public void saveStudents(Students students) {
		repo.save(students);

	}

	public List<Students> findStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();

	}

	public String deleteStudentByID(int id) {
		Optional<Students> st=repo.findById(id);
		if(st.isPresent()) {
			Students s=st.get();
			
			repo.delete(s);
			return "deleted successfully";
		}else
			return "student not found";
	}

	public String updateStudentById(int id, Students s) {
		// TODO Auto-generated method stub
		Optional<Students>optional=repo.findById(id);
		if(optional.isPresent()) {
			Students existing=optional.get();
			if(s.getName()!=null) {
				existing.setName(s.getName());
			}

			if(s.getRoll()!=0) {
				existing.setRoll(s.getRoll());
			}


			repo.save(existing);
			return "Student is updated";
		}else
			return "Something went wrong";


	}

}
