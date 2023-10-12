package com.infinity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infinity.config.AppConfig;
import com.infinity.model.Student;
import com.infinity.service.StudentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService service = context.getBean(StudentService.class);

		Student student = context.getBean(Student.class);
		student.setStudentId(101);
		student.setStudentName("NOAH");
		student.setStudentScore(80);
		student.getDepartment().setDeptId(10);
		student.getDepartment().setDeptName("IT");

		service.addStudent(student);
		Student result = service.findStudentById(101);
		
		System.out.println(result);
		if(result!=null)
		{
			System.out.println(result.getDepartment());
		}

//		List<Student> lst =service.findAllStudents();
//		System.out.println(lst);
	}
}
