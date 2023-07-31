package com.annotation_with_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	@Autowired
	@Qualifier("address2")
	private Address1 address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, Address1 address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	

}
