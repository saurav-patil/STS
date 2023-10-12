package com.roughInfinity;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roughInfinity.model.Employee;
import com.roughInfinity.model.EmployeeDB;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeDB employeeDB = factory.getBean("empDB", EmployeeDB.class);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Employee Id: ");
		
		int inputId = sc.nextInt();
		for (Employee empdb : employeeDB.getEmpList())
		{
			if (empdb.getEmpId() == inputId) {
				System.out.println("\nEmployee Info: \n");
				System.out.println("Employee ID: " +empdb.getEmpId());
				System.out.println("Employee Name: " +empdb.getEmpName());
				System.out.println("Employee Salary: "+empdb.getEmpSal());
			}
		}
		sc.close();
	}
}
