package com.roughInfinity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roughInfinity.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee = factory.getBean("empBean", Employee.class);
        System.out.println("Employee Details ");
        System.out.println("---------------------------");
        System.out.println("Employee ID: "+employee.getEmpId());
        System.out.println("Employee Name: "+employee.getEmpName());
        System.out.println("Employee Salary: "+employee.getEmpSal());
        System.out.println("Employee BU: "+employee.getEmpBU());
        System.out.println("Employee Age: "+employee.getEmpAge());
        
    }
}
