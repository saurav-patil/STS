package com.infinity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinity.model.Student;
import com.infinity.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
	
	@Override
	public boolean addStudent(Student student) {
		return repository.createStudent(student);
	}

	@Override
	public Student findStudentById(int studentId) {
		return repository.readStudentById(studentId);
	}

	@Override
	public List<Student> findAllStudents() {
		return repository.readAll();
	}

}
