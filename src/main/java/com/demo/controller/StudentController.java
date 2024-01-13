package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	private StudentService ss;

	// To display Student list
	@GetMapping(value = "/")
	public List<Student> StudentList() {
		return ss.findAll();
	}

	// Post the Student
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student s) {
		return ss.save(s);
	}

	// get Student by Id
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return ss.findById(id);
	}

	// Update Student by ID
	@PutMapping("/{id}")
	public Student updateStudentById(@RequestBody Student s) {
		return ss.save(s);
	}

	// Delete Student By Id
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		ss.deleteById(id);
	}

}
