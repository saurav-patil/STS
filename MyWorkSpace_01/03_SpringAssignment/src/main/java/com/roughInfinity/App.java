package com.roughInfinity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roughInfinity.model.SBU;

public class App {
	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		SBU sbu =factory.getBean("sbuBean", SBU.class);
		System.out.println("SBU details \n-------------------------------");
		System.out.println(sbu);
		System.out.println("\nEmployee Details \n---------------------------------------");
		System.out.println(sbu.empList);
	
	}
}
