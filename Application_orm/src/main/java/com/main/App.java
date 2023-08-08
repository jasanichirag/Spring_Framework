package com.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.entity.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("starting....");

// configuration file;
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao std = context.getBean("stdDao", StudentDao.class);

// Scanner Class;
		Scanner Sc = new Scanner(System.in);
		boolean ch = true;
		while (ch) {
// MENU :
			System.out.println("\n\n*********  ::  Welcome To Spring ORM Project  ::  *********");

			System.out.println("\n\n>>\tPRESS 1 For Add New Student.");
			System.out.println(">>\tPRESS 2 For Display All Student.");
			System.out.println(">>\tPRESS 3 For Get Details Of Single Student.");
			System.out.println(">>\tPRESS 4 For Delete Students.");
			System.out.println(">>\tPRESS 5 For Update Student.");
			System.out.println(">>\tPRESS 6 For Exit.");
			try {
				// input;
				int num;
				System.out.print("ENTER NUMBER : ");
				num = Sc.nextInt();
				System.out.println("======================================");
				switch (num) {
				case 1: {
					// System.out.println("insert student");
					Student s = new Student();
					// insert Student;
					System.out.print("Enter Student Id : ");
					s.setSid(Sc.nextInt());
					System.out.print("Enter Student Name : ");
					s.setName(Sc.nextLine());
					s.setName(Sc.nextLine());
					System.out.print("Enter Student Address : ");
					s.setAddress(Sc.nextLine());
					System.out.print("Enter Student Email : ");
					s.setEmail(Sc.nextLine());
					std.insertStudent(s);
					System.out.println("Data entered successfully");
//					System.out.println(s.getAddress() + " " + s.getEmail() + " " + s.getName() + " " + s.getSid());
					break;
				}
				case 2: {
					// get All Student Data ;
					// System.out.println("Get All student");
					System.out.println("======================================");
					List<Student> list = std.getAllStudent();
					for (Student s : list) {
						System.out.println("Student Id : " + s.getSid());
						System.out.println("Student Name : " + s.getName());
						System.out.println("Student Address : " + s.getAddress());
						System.out.println("Student Email : " + s.getEmail());
						System.out.println("**************************************");
					}
					System.out.println("======================================");
					break;
				}
				case 3: {
					// System.out.println("get single student");
					// get Student By Id (Single Student);
					System.out.print("Enter Student Id : ");
					int id = Sc.nextInt();
					System.out.println("======================================");
					Student s = std.getStdById(id);
					System.out.println("Student Id : " + s.getSid());
					System.out.println("Student Name : " + s.getName());
					System.out.println("Student Address : " + s.getAddress());
					System.out.println("Student Email : " + s.getEmail());
					System.out.println("======================================");
					break;
				}
				case 4: {
					// System.out.println("delete student by id");
					// delete Student By Id;
					System.out.print("Enter Student Id : ");
					int id = Sc.nextInt();
					std.deleteStudetById(id);
					System.out.println("Data Delete successfully");
					break;
				}
				case 5: {

					// System.out.println("update student");
					Student s = new Student();
					// Update Student;
					System.out.print("Enter Student Id : ");
					s.setSid(Sc.nextInt());
					System.out.print("Enter Student Name : ");
					s.setName(Sc.nextLine());
					s.setName(Sc.nextLine());
					System.out.print("Enter Student Address : ");
					s.setAddress(Sc.nextLine());
					System.out.print("Enter Student Email : ");
					s.setEmail(Sc.nextLine());
					std.updateById(s);
					System.out.println("Data Update successfully");
					break;
				}
				case 6: {
					// System.out.println("exit");
					ch = false;
					break;
				}

				default: {
					System.out.println("Please Enter Valid Input");
					break;
				}
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try With Another One !!");
				System.out.println(e);
			}
		}
		System.out.println("Thankyyou For Using My Application.!!!");
		System.out.println("See you Soon.!!!");

	}
}
