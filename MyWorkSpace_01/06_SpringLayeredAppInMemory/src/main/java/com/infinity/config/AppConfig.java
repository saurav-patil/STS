package com.infinity.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.infinity.model.Student;

@Configuration
@ComponentScan("com.infinity")
public class AppConfig {
	@Bean
	public List<Student> getList()
	{
		return new ArrayList<>();
	}
}
