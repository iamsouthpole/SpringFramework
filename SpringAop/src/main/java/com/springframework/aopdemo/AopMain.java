package com.springframework.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.aopdemo.service.ShapeService;

/**
 * Hello world!
 *
 */
public class AopMain 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
    }
}
