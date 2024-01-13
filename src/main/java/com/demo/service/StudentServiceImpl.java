package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Student;
import com.demo.repo.StudentRepo;

@Service
@Transactional	
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo sr;

	@Override
	public List<Student> findAll() {
		return sr.findAll();
	}

	@Override
	public Student save(Student s) {
		return sr.save(s);
	}

	@Override
	public Student findById(int id) {

		return sr.findById(id);
	}

	@Override
	public Student deleteById(int id) {
		return sr.deleteById(id);
	}
}
