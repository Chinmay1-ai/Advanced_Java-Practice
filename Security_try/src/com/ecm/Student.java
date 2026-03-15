package com.ecm;

public class Student {

	private int id;
	private String fName;
	private String lName;
	private int marks;
	
	
	Student(int id , String fName , String lName , int marks ){
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fName;
	}
	
	public String getLname() {
		return lName;
	}
	
	public int getMarks() {
		return marks;
	}
	
	
	public void GetGrade() {
		if(marks <= 35) {
			System.out.println("The Student is Fail");
		}else if(marks >= 90) {
			System.out.println("The Student has A Grade");
		}else if(marks >= 80) {
			System.out.println("The Student has B Grade");
		}else if(marks >= 70) {
			System.out.println("The Student has C Grade");
		}
	}
}
