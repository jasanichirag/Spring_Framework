package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class App {
	public static void main(String[] args) {

		System.out.println("Application Start....");

		ApplicationContext context = new ClassPathXmlApplicationContext("BeanConfing.xml");
		EmployeeDao e = context.getBean("empDao", EmployeeDao.class);
		// insert employee;
		Employee e1 = new Employee(10, "ritesh", "navadiya@gmail.com");
		e.insertEmp(e1);
		System.out.println("insert successfull...");

		// get employee;
		Employee e2 = e.getEmpById(5);
		System.out.println("Id : " + e2.getId());
		System.out.println("Name : " + e2.getName());
		System.out.println("Email : " + e2.getEmail());

		// get all date form employee;
		List<Employee> list = e.getEmployee();
		for (Employee e3 : list) {
			System.out.println("Id : " + e3.getId());
			System.out.println("Name : " + e3.getName());
			System.out.println("Email : " + e3.getEmail());
			System.out.println("==================================");
		}

		// employee delete by id;
		e.deleteEmp(11);

		// employee update by id;
		Employee e4 = new Employee(1, "chirag", "jasani@gmail.com");
		e.update(e4);
	}
}
