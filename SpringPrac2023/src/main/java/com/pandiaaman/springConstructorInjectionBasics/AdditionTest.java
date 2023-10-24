package com.pandiaaman.springConstructorInjectionBasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springConstructorInjectionBasics/additionConsInjConfig.xml");
		
		Addition addOne = context.getBean("addOne", Addition.class);
		System.out.println(addOne.sum());
		
		Addition addTwo = context.getBean("addTwo", Addition.class);
		System.out.println(addTwo.sum());

	}

}
