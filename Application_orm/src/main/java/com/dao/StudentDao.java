package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entity.Student;

public class StudentDao {

	public HibernateTemplate hibernateTemplate;

	// getter And Setter Method- Hibetnatetamplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// insert Student;
	@Transactional
	public void insertStudent(Student s) {
		this.hibernateTemplate.save(s);
	}

	// Update Student details;
	@Transactional
	public void updateById(Student s) {
		this.hibernateTemplate.update(s);
	}

	// get student By id;
	@Transactional
	public Student getStdById(int id) {
		Student s = this.hibernateTemplate.get(Student.class, id);
		return s;
	}

	// get All Student;
	@Transactional
	public List<Student> getAllStudent() {
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}

	// delete Student By id;
	@Transactional
	public void deleteStudetById(int id) {
		Student s = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(s);
	}

}
