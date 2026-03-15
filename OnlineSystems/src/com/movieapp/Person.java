package com.movieapp;

public class Person {

	private String name;
	private long mobile;

	public Person(String name, long mobile) {
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
