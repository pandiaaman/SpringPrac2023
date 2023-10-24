package com.pandiaaman.springAutowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationTest {

	/*
	 * Three ways to implement autowire annotation in spring:
	 * 	Setter
	 * 	Constructor
	 * 	Field
	 */
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext();
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springAutowireAnnotation/AutowiringAnnotationConfig.xml");
		
		Emp emp1 = context.getBean("emp1", Emp.class);
		System.out.println(emp1);
	}

}
