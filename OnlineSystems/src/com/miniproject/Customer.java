package com.miniproject;

public class Customer extends User {

	private String address;

	public Customer(String name, long mobileNo, String address) {
		super(name, mobileNo);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	
}
