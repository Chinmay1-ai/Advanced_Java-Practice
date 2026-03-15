package com.movieapp;

public class Customer extends Person {

	private String email;

	public Customer(String name, long mobile, String email) {
		super(name, mobile);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
}
