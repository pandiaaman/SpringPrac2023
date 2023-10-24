package com.pandiaaman.SpringPrac2023;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pandiaaman.springAnnotationBasics.Vehicle;
import com.pandiaaman.springBasics.Student;
import com.pandiaaman.springCollectionBasics.Teacher;
import com.pandiaaman.springReferenceBasics.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //ApplicationContext mirrors the IOC container, which stores all the objects in the application and injects them accordingly
        ApplicationContext contextXML1 = new ClassPathXmlApplicationContext("com/pandiaaman/springBasics/studentConfig.xml");
        
        //there are three types of injections in spring : setter, constructor and field
        //using property tag in xml internally uses the setter injections
        Student studOne = contextXML1.getBean("studOne", Student.class);
        System.out.println(studOne);	 
        
        Student studTwo = contextXML1.getBean("studTwo", Student.class);
        System.out.println(studTwo);
        
        //examples to retrieve collections in IOC container
        ApplicationContext contextXML2 = new ClassPathXmlApplicationContext("com/pandiaaman/springCollectionBasics/teacherConfig.xml");
        
        Teacher teacherOne = contextXML2.getBean("teacherOne", Teacher.class);
        System.out.println(teacherOne);
        
        //examples to understand using references in spring
        ApplicationContext contextXML3 = new ClassPathXmlApplicationContext("com/pandiaaman/springReferenceBasics/employeeConfig.xml");
        
        Employee employeeOne = contextXML3.getBean("employeeOne", Employee.class);
        Employee employeeTwo = contextXML3.getBean("employeeTwo", Employee.class);
        
        System.out.println(employeeOne);
        System.out.println(employeeTwo);
        
        //another way of shadowing IOC container is by using AnnotationConfigApplicationContext, that uses annotations 
//        ApplicationContext contextAnnotation1 = new AnnotationConfigApplicationContext();
//        
//        Vehicle vehicleOne = contextAnnotation1.getBean("vehicleOne", Vehicle.class);
//        
//        System.out.println(vehicleOne);
    }
}
