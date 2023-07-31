package com.constructorAutowiring;

public class ConsAdd {
	private String street;
	private String street1;
	
	public ConsAdd() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ConsAdd(String street, String street1) {
		this.street = street;
		this.street1 = street1;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	

}
