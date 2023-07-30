package com.life_cycle;

public class Man {
private int age;

public Man(int age) {
	this.age=age;
}

public Man() {
	// TODO Auto-generated constructor stub
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public void init() {
	System.out.println("this is init method....");
}

public void destroy() {
	System.out.println("This is Destroy Method....");
}

}
