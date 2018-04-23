package com.springframework.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*
	@Before("allCircleGetters()")
	public void loggingAdvice(JoinPoint joinPoint) {
//		System.out.println("Advice run. Method " + joinPoint.getTarget() + "called");
		
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnString") //AfterReturning | After
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method contains string args is called. The string is " + name + ". The returned value is " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="exception")
	public void exceptionAdvice(String name, Exception exception) {
		System.out.println(name + " is throwing an exception. The exception is " + exception);
	}
	*/
	
	@Around("@annotation(com.springframework.aopdemo.aspect.Loggable)") //("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint pjp) {
		
		Object value = null;
		
		try {
			System.out.println("Before advice pjp");
			value = pjp.proceed();
			System.out.println("After advice pjp");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("After throwing");
		}
		System.out.println("After final");
		return value;
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
//	@Pointcut("within(com.springframework.aopdemo.model.Circle)")
//	public void allCircleGetters() {}
	
	public void loggingAdvice() {
		System.out.println("Loggin from the advice.");
	}

}
