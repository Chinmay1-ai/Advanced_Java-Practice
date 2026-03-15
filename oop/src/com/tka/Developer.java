package com.tka;

public class Developer extends Employee {

	String programmingLanguage;

	public void showDeveloperDetails() {
		displayInfo();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}
