package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Autowiring start...");
		ApplicationContext context =new ClassPathXmlApplicationContext("com/autowiring/autowiring.xml");
		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println("emp id :"+e1.getEid());
		System.out.println("emp name : "+e1.getName());
		System.out.println("emp address : "+e1.getAdd().getStreet());
		System.out.println("emp address2 : "+e1.getAdd().getStreet2());
	}
}
