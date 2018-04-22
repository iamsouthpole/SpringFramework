package com.springframework.aopdemo.service;

import com.springframework.aopdemo.aspect.Loggable;
import com.springframework.aopdemo.model.Circle;
import com.springframework.aopdemo.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	

}
