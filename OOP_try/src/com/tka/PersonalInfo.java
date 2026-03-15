package com.tka;

public class PersonalInfo {

	private String name;
	private int age;
	private double salary;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void showDetail() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Salary is : " + salary);
	}
}
