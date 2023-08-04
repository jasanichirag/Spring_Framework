package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("start!...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/main/beanConfig.xml");
		StudentDao s = context.getBean("dao", StudentDao.class);
		// insert data;
		Student s1 = new Student();
//		s1.setId(102);
//		s1.setName("ritesh");
//		s1.setCity("surat");
//		int i = s.insertStudent(s1);
//		System.out.println(i + " data added successfully...");

		// update data;
//		s1.setId(108);
//		s1.setCity("surat");
//		s1.setName("balar milan");
//		int i = s.updateData(s1);
//		System.out.println(i + " update data...");

		// delete data;
//		int i = s.deleteById(108);
//		System.out.println(i + " data delete...");

		// select one object;
//		Student s3 = s.selectById(101);
//		System.out.println("Id : " + s3.getId());
//		System.out.println("Name : " + s3.getName());
//		System.out.println("City : " + s3.getCity());

		// select all student;

		List<Student> list = s.getAllStudent();
		for (Student st : list) {
			System.out.println("Id : " + st.getId());
			System.out.println("Name : " + st.getName());
			System.out.println("City : " + st.getCity());
			System.out.println("--------------------------------");
		}

	}
}
