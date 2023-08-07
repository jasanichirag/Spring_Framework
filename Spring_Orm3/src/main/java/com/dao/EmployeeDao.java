package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.entity.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// save method;
	@Transactional
	public void insertEmp(Employee e) {
		this.hibernateTemplate.save(e);
		System.out.println("insert done.");
	}

	// delete method;
	@Transactional
	public void deleteEmp(int id) {
		Employee e = this.hibernateTemplate.get(Employee.class, id);
		this.hibernateTemplate.delete(e);
		System.out.println("Delete successfully...ID : " + id);
	}

	// update method;
	@Transactional
	public void update(Employee e) {
		this.hibernateTemplate.update(e);
	}

	// get employee
	@Transactional
	public Employee getEmpById(int id) {
		Employee e = this.hibernateTemplate.get(Employee.class, id);
		return e;
	}

	// gel all employee;
	@Transactional
	public List<Employee> getEmployee() {
		List list = this.hibernateTemplate.loadAll(Employee.class);
		return list;
	}
}
