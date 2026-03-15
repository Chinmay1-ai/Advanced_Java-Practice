package com.management;

public class SchlolarshipStudent extends Student {

	public SchlolarshipStudent(String name, String address, int rollNo, float marks) {
		super(name, address, rollNo, marks);
	}

	public void eligibility(Student s) {
		if (marks >= 75) {
			System.out.println("Student is Eligible for Scholarship");
			System.out.println(".......Student Details........");
			System.out.println("Name of Student : " + s.getName());
			System.out.println("Address of Student : " + s.getAddress());
			System.out.println("Roll No. of Student : " + s.getRollNo());
			System.out.println("Marks of Student : " + s.getMarks());
		} else {
			System.out.println("Student is not Eligible for Scholarship");
		}
	}
}
