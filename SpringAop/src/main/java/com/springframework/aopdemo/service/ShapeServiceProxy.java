package com.springframework.aopdemo.service;

import com.springframework.aopdemo.aspect.LoggingAspect;
import com.springframework.aopdemo.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}

}
