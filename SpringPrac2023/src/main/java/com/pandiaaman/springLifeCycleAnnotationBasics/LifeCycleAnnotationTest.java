package com.pandiaaman.springLifeCycleAnnotationBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleAnnotationTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springLifeCycleAnnotationBasics/annotationLifeCycleConfig.xml");
		
		Example exampleOne = context.getBean("exampleOne", Example.class);
		System.out.println(exampleOne);
		
		context.registerShutdownHook();
	}

}
