package com.annotation_with_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Annotation Autowiring Starting....!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/annotation_with_Autowiring/annotation.xml");
		Student s = context.getBean("s",Student.class);
		System.out.println(s.getName());
		System.out.println("address1 : "+s.getAddress().getAdd1());
		System.out.println("address2 : "+s.getAddress().getAdd2());
	}
}
