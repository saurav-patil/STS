package com.infinity.repository;

import java.util.List;

import com.infinity.model.Student;

public interface StudentRepository {
	public boolean createStudent(Student student);
	
	public Student readStudentById(int studentId);
	
	public List<Student> readAll();
}
