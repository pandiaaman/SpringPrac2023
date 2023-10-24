package com.pandiaaman.springLifeCycleBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaTest {

	public static void main(String[] args) {
		
		//ApplicationContext does not have the destroy method, AbstractApplicationContext has it
		AbstractApplicationContext lifeCycleContext = new ClassPathXmlApplicationContext("com/pandiaaman/springLifeCycleBasics/samosaLifeCycleConfig.xml");
		
		Samosa samosaOne = lifeCycleContext.getBean("samosaOne",Samosa.class);
		System.out.println(samosaOne);
		
		//To implement destroy method : we need to use registerShutDownHook
		lifeCycleContext.registerShutdownHook();
	}
}
