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
		int i = jdbcTemplate.update(sql,s.getId(),s.getName(),s.getEmail());
		return i;
	}
}
