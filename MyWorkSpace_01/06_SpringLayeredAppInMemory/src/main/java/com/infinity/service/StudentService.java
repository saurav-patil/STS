package com.infinity.service;

import java.util.List;

import com.infinity.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	
	public Student findStudentById(int studentId);
	
	public List<Student> findAllStudents();
	
}
