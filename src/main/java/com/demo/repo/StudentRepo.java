package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	List<Student> findAll();

	Student findById(int id);

	Student save(Student s);

	Student deleteById(int id);
}	
