package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Bean Scope Start....");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/beanScope/scope.xml");
		Student s1 = context.getBean("st",Student.class);
		Student s2 = context.getBean("st",Student.class);
		s1.setAddress("bhavnagar");
		s1.setEmail("jasani@gmail.com");
		s1.setName("jasani chirag");
		s2.setAddress("sanosara");
		s2.setEmail("chirag@gmail.com");
		s2.setName("jasani chirag s.");
		System.out.println( "address : "+s1.getAddress());
		System.out.println("email : "+s1.getEmail());
		System.out.println("name : "+s1.getName());
		System.out.println("==============================");
		System.out.println( "address : "+s2.getAddress());
		System.out.println("email : "+s2.getEmail());
		System.out.println("name : "+s2.getName());
	}
}
