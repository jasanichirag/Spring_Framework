package com.standalone_collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Stand Alone Collection Start......!!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone_collection/standalode.xml");
		Man m1 = context.getBean("m1",Man.class);
		System.out.println("Friends : " +m1.getFriends()); // get list
		System.out.println("-----------------------------------");
		System.out.println(m1.getFees()); // get map
		System.out.println("=============================");
		System.out.println(m1.getMobile()); // get set
	}
}
