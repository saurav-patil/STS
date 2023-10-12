package com.roughInfinity.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine;
	
	public String getEngineData() {
		return engine.name;
	}
}
