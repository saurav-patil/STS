package com.infinity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinity.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	private List<Student> dummyDB = null;

	@Override
	public boolean createStudent(Student student) {
		
		return dummyDB.add(student);
	}

	@Override
	public Student readStudentById(int studentId) {
		Student result = null;
		Optional<Student> student = dummyDB.stream().filter(s -> s.getStudentId()==studentId).findFirst();
		if(student.isPresent())
		{
			result = student.get() ;
		}
		return result;
	}

	@Override
	public List<Student> readAll() {
		return dummyDB;
	}
	
}
