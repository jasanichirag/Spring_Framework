package com.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;

public class App {
	public static void main(String[] args) {
		System.out.println("Start....");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bean/config.xml");
//      JdbcTemplate jt = context.getBean("jdbcTemplate",JdbcTemplate.class);

// insert Query;

//   String sql="insert into student (id,name,email) values(?,?,?)";

// fire query;
//
//		int i = jt.update(sql, 2, "jasani chirag", "jasani@gmail.com");
//		System.out.println(i + " data insert successfully...");

// insert 
//		StudentDao sd = context.getBean("studentDao", StudentDao.class);
//		Student s = new Student();
//		s.setId(168);
//		s.setEmail("chirag@gmail.com");
//		s.setName("jasani");
//		int i = sd.insert(s);
//		System.out.println(i + " : data insert successfully....");

// update data;
//		Student s = new Student();
//		s.setId(1);
//		s.setName("jasani");
//		s.setEmail("gunjan@gmail.com");
//		StudentDao sd1 = context.getBean("studentDao", StudentDao.class);
//		int i = sd1.updateStudent(s);
//		System.out.println(i + " data update successfully...!!!");

// delete data ;
//		StudentDao s1 = context.getBean("studentDao", StudentDao.class);
//		int i = s1.deleteStudentById(1);
//		System.out.println(i + " data deleted...");

// select single data;
//		StudentDao s = context.getBean("studentDao", StudentDao.class);
//		Student s1 = s.getById(142);
//		System.out.println("ID : " + s1.getId());
//		System.out.println("Email : " + s1.getEmail());
//		System.out.println("Name : " + s1.getName());

// select All student ;

		StudentDao s1 = context.getBean("studentDao", StudentDao.class);
		List<Student> list = s1.getAllStudent();
		for (Student s : list) {
			System.out.println("ID : " + s.getId());
			System.out.println("Name : " + s.getName());
			System.out.println("Email : " + s.getEmail());
			System.out.println("--------------------------------------");
		}
	}
}
