package com.bank;

public class Customer extends Person {

	private int customerId;

	public Customer(String name, int age, int customerId) {
		super(name, age);
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}
}
