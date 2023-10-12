package com.roughInfinity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roughInfinity.model.Greeting;

public class App {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
		Greeting greeting = factory.getBean("id", Greeting.class);
		String str = greeting.sayMyName();
		System.out.println(str);
	}
}
