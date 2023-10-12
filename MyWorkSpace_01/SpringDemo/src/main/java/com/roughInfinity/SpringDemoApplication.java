package com.roughInfinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.roughInfinity.model.Car;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context  = SpringApplication.run(SpringDemoApplication.class, args);
		Car car =context.getBean(Car.class);
		System.out.println(car.getEngineData());
	}
}
