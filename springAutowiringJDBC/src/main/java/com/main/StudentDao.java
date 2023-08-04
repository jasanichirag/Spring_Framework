package com.main;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertStudent(Student s) {
		String sql = "insert into student2(id,name,city) values(?,?,?)";
		int i = this.jdbcTemplate.update(sql, s.getId(), s.getName(), s.getCity());
		return i;
	}

	public int updateData(Student s) {
		String sql = "update student2 set name=?,city=? where id=?";
		int i = this.jdbcTemplate.update(sql, s.getName(), s.getCity(), s.getId());
		return i;
	}

	public int deleteById(int id) {
		String sql = "delete from student2 where id=?";
		int i = this.jdbcTemplate.update(sql, id);
		return i;
	}

	public Student selectById(int id) {

		String sql = "select * from student2 where id=?";
		RowMapper<Student> rm = new Rowmapperinp();
		Student s = this.jdbcTemplate.queryForObject(sql, rm, id);
		return s;
	}

	public List<Student> getAllStudent() {

		String sql = "select * from student2";
		List<Student> list = this.jdbcTemplate.query(sql, new Rowmapperinp());
		return list;
	}
}
