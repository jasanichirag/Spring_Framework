package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Bean Scope Start....");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/beanScope/scope.xml");
		// bean scope prototype;
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
		
		System.out.println("======================");
		// Bean scope is prototype;
		Man m1 = context.getBean("man",Man.class);
		Man m2 = context.getBean("man",Man.class);
		System.out.println("m1 Object : "+m1.hashCode());
		System.out.println("m2 object : "+m2.hashCode());
		System.out.println("==============================");
		ManSingleton m3 = context.getBean("manSingleton",ManSingleton.class);
		ManSingleton m4 = context.getBean("manSingleton",ManSingleton.class);
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
	}
}
