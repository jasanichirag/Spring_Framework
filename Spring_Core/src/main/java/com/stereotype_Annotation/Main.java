package com.stereotype_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	System.out.println("stereotype annotation.....!!!!");
	ApplicationContext context=new ClassPathXmlApplicationContext("com/stereotype_Annotation/stereotype.xml");
	Student s1 = context.getBean("s",Student.class);
	System.out.println("Address : "+s1.getAddress());
	System.out.println("Name : "+s1.getName());
	System.out.println("Mobile : "+s1.getMobile());
}
}
