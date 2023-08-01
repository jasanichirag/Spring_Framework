package com.stereotype_Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s") // optional
public class Student {
	@Value("jasani")
private String name;
	@Value("sanosara")
	private String address;
	@Value("#{mobile}")
	private List<String> mobile;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<String> getMobile() {
	return mobile;
}
public void setMobile(List<String> mobile) {
	this.mobile = mobile;
}

}
