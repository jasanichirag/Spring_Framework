package com.constructorAutowiring;

public class ConsPerson {
	private String name;
	private ConsAdd consadd;
	
	
	public ConsPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public ConsPerson(String name, ConsAdd consadd) {
		this.name = name;
		this.consadd = consadd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ConsAdd getConsadd() {
		return consadd;
	}
	public void setConsadd(ConsAdd consadd) {
		this.consadd = consadd;
	}
	

}
