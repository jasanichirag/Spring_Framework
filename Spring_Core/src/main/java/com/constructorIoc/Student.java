package com.constructorIoc;

public class Student {
private String name;
private int id;
private Address add;
public Student(int id,String name,Address add) {
	this.id=id;
	this.name=name;
	this.add=add;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Student() {
	
}
}
