package com.standalone_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Man {

	private List<String> friends;
	private Map<String, Integer> fees;
	private Set<String> mobile;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public Set<String> getMobile() {
		return mobile;
	}

	public void setMobile(Set<String> mobile) {
		this.mobile = mobile;
	}
	
}
