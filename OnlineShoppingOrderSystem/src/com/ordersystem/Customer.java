package com.ordersystem;

public class Customer extends User {

	private String address;

	public Customer(String name, long mobile, String address) {
		super(name, mobile);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
