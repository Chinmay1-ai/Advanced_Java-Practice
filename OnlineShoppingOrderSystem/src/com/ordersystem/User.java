package com.ordersystem;

public abstract class User {

	private String name;
	private long mobile;

	public User(String name, long mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public long getMobile() {
		return mobile;
	}
}
