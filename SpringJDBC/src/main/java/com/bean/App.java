package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
System.out.println("Start....");
ApplicationContext context=new ClassPathXmlApplicationContext("com/bean/config.xml");
//JdbcTemplate jt = context.getBean("jdbcTemplate",JdbcTemplate.class);

// insert Query;

//String sql="insert into student (id,name,email) values(?,?,?)";
//
// fire query;

//int i = jt.update(sql,2,"jasani chirag","jasani@gmail.com");
//System.out.println(i+" data insert successfully...");

// insert 
//StudentDao sd = context.getBean("studentDao",StudentDao.class);
//Student s=new Student();
//s.setId(101);
//s.setEmail("chirag@gmail.com");
//s.setName("jasani chirag.");
//int i=sd.insert(s);
//System.out.println(i+" : data insert successfully....");

// update data;
//Student s=new Student();
//s.setId(1);
//s.setName("jasani");
//s.setEmail("gunjan@gmail.com");
//StudentDao sd1 = context.getBean("studentDao",StudentDao.class);
//int i = sd1.updateStudent(s);
//System.out.println(i +" data update successfully...!!!");

// delete data ;
Student s=new Student();
StudentDao s1 = context.getBean("studentDao",StudentDao.class);
int i = s1.deleteStudentById(1);
System.out.println(i+" data deleted...");
    }
}
