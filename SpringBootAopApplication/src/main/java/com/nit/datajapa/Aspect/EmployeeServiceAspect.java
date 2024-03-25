package com.nit.datajapa.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  
@Component 
public class EmployeeServiceAspect {

	//JoinPoint is a used to Execute the method
	//Point cut also execute the method and read the packages inside class
	//returning advice and Throwing Advice also working same
	//Around advice working same but return type is Object vary powerful Annotation
	//@annotation also created based on requires using only one method executed. 
	
	//"execution(* com.nit.datajapa.controller.*.*(..)) and args(empId, fname, sname)"
	//first * means to take any return type of method
	//last two star means to read class and method. 
	//.. means to passes based on requires arguments
	
	@Before(value="execution(* com.nit.datajapa.Service.EmployeeService.*(..)) and args(empId, fname, sname)")
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
		System.out.println("Before method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
		}
	
	@After(value = "execution(* com.nit.datajapa.Service.EmployeeService.*(..)) and args(empId, fname, sname)")
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
	System.out.println("After method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	}
	
	
//	@Pointcut("execution(* com.nit.datajapa.controller.*.*(..))")
//	public void logging(JoinPoint joinPoint) {
//		System.out.println("Before method:" + joinPoint.getSignature()); 
//	}
//	
//	public void before() {
//		
//	}
}
