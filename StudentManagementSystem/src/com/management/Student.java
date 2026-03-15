package com.management;

public class Student extends Person {

	private int rollNo;
	float marks;

	public Student(String name, String address, int rollNo, float marks) {
		super(name, address);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public float getMarks() {
		return marks;
	}

}
