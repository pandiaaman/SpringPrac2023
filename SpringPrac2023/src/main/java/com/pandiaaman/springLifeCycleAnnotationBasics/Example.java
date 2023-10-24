package com.pandiaaman.springLifeCycleAnnotationBasics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subject;

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	//init method
	@PostConstruct
	public void start() {
		System.out.println("init method using annotation");
	}
	@PreDestroy
	public void end() {
		System.out.println("destroy method using annotation");
	}
	
}
