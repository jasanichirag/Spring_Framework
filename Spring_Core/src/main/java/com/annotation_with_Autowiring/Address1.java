package com.annotation_with_Autowiring;

public class Address1 {
	
	private String add1;
	private String add2;
	
	public Address1() {
		// TODO Auto-generated constructor stub
	}
	
	public Address1(String add1, String add2) {
		this.add1 = add1;
		this.add2 = add2;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	

}
