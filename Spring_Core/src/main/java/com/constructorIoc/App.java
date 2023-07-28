package com.constructorIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Constructor Over loding .....!!!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/constructorIoc/overloding.xml");
        Student s1 = (Student) context.getBean("std");
        System.out.println("id :"+ s1.getId()+": name : "+ s1.getName()+ ":  address : "+s1.getAdd().getAdd()+" : Address id : "+ s1.getAdd().getAid());
        
        Sum s = (Sum) context.getBean("sum");
        System.out.println("Sum : "+s.sum());
    }
}
