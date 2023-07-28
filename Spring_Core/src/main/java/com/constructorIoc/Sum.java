package com.constructorIoc;

public class Sum {
private int a;
private int b;

public Sum() {
	
}

public Sum(int a,int b) {
	System.out.println("int , int");
	this.a=a;
	this.b=b;
}

public Sum(double a,double b) {
	System.out.println("double , double");
	this.a=(int) a;
	this.b=(int) b;
}

public Sum(double a,int b) {
	System.out.println("double , int");
	this.a=(int) a;
	this.b= b;
}

public Sum(String a,String b) {
	
	System.out.println("string , string");
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
}

public int sum() {
	return a+b;
}

}
