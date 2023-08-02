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

StudentDao sd = context.getBean("studentDao",StudentDao.class);
Student s=new Student();
s.setId(101);
s.setEmail("chirag@gmail.com");
s.setName("jasani chirag.");
int i=sd.insert(s);
System.out.println(i+" : data insert successfully....");


    }
}
