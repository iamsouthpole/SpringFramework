package com.springframework.aopdemo.service;

import com.springframework.aopdemo.model.Circle;
import com.springframework.aopdemo.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanName) {
		if(beanName.equals("shapeService")) return new ShapeServiceProxy();
		if(beanName.equals("circle")) return new Circle();
		if(beanName.equals("triangle")) return new Triangle();
		return null;
	}

}
