package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Student;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student s) {
		String sql="insert into Student (id,name,email) value(?,?,?)";
		int i = this.jdbcTemplate.update(sql,s.getId(),s.getName(),s.getEmail());
		return i;
	}
	
	public int updateStudent(Student s) {
		String sql="update student set name=?,email=? where id=?";
		int i=this.jdbcTemplate.update(sql,s.getName(),s.getEmail(),s.getId());
		return i;
	}
	
	public int deleteStudentById(int id) {
		String sql="delete from student where id=?";
		int i = this.jdbcTemplate.update(sql,id);
		return i;
		
	}
}
