package com.declare;

public class Student {

	int id;
	String fName;
	String lName;
	int age;
	long mobNo;
    
	
	public Student(int id, String fName, String lName, int age, long mobNo) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.mobNo = mobNo;
		this.DisplayDetails();
	}
	public Student(int id, String fName, String lName, int age) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.DisplayDetails();
	}
	
	public void DisplayDetails() {
		System.err.println("Student Detail !!!!!");
		
		System.out.println("the ID of Student is "+id);
		System.out.println("The Name of Student is "+fName+" "+lName);
		System.out.println("The Age of Student is "+age);
		System.out.println("The Mobile Number of Student is "+mobNo);
		System.out.println("---------------------------------------");

	}

}
