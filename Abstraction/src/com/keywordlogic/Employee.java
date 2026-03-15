package com.keywordlogic;

public class Employee {

	String name;
	int age;
	final double salary = 25000.252;
	final int empId = 121;
	final String joiningDate = "10-April";
	final String empType = "Permanent";

	public Employee() {
		System.out.println("The Salary of of Employee is " + salary);
		System.out.println("The ID of Employee is " + empId);
	}

	public Employee(String name, int age) {
		this();
		System.out.println("The Name of Employee is " + name);
		System.out.println("The Age of Employee is " + age);
	}

	public void displayInfo() {
		System.out.println("The Joining date of Employee is " + joiningDate);
		System.out.println("The Employement Type of Employee is " + empType);
	}
	public void displayInfo1() {
		
		System.out.println("The Joining date of Employee is " + joiningDate);
		System.out.println("The Employement Type of Employee is " + empType);
	}

}
