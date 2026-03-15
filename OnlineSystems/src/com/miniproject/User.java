package com.miniproject;

public class User {

	private String name;
	private long mobileNo;

	public User(String name, long mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return name;
	}

	public long getMobileNo() {
		return mobileNo;
	}
}
