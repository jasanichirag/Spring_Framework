package com.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("expression language....");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/expressionlanguage/expressionLanguage.xml");
		Maths m1 = context.getBean("maths",Maths.class);
		System.out.println("A : "+m1.getA());
		System.out.println("B : "+m1.getB());
	}
}
