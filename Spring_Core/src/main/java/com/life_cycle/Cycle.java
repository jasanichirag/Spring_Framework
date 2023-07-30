package com.life_cycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cycle {

	public static void main(String[] args) {
		System.out.println("Life Cycle......");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/life_cycle/cycle.xml");
		Man m1 = (Man) context.getBean("m1");
		System.out.println("Age : " +m1.getAge());
		context.registerShutdownHook();
	}
}
