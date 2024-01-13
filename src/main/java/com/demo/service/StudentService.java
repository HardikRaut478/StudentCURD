package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int id);

	Student save(Student s);

	Student deleteById(int id);
}
