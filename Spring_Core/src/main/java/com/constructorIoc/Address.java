package com.constructorIoc;

public class Address {
	private String add;
	private int aid;
	
	public Address() {
	
	}
	
	public Address(int aid,String add){
		this.add=add;
		this.aid=aid;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

}
