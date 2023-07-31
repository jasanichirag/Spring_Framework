package com.constructorAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Constroctor Autowiring Start...!!!");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructorAutowiring/consAutowiring.xml");
		ConsPerson  p= context.getBean("p",ConsPerson.class);
		ConsAdd a = context.getBean("a",ConsAdd.class);
		
		System.out.println(p.getName());
		System.out.println(p.getConsadd().getStreet());
		System.out.println(p.getConsadd().getStreet1());
		//System.out.println("-----------------------------\n"+a.getStreet()+"\n"+a.getStreet1());
	}
}
