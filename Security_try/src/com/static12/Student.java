package com.static12;

public class Student {

	int id;
	String name;
	static String collegeName = "HVPM COET";

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void diplayDetail() {
		System.out.println("The ID of Student is : " + id);
		System.out.println("The Name of Student is " + name);
		System.out.println("The College Name of Student is : " + collegeName);
		System.out.println("---------------------------------------------------");
	}

	public static void main(String[] args) {

		Student s = new Student(121, "Rahul Gandhi");
		Student s1 = new Student(101, "Narendra Modi");
		Student s2 = new Student(111, "Amit Shah");

		s.diplayDetail();
		s1.diplayDetail();
		s2.diplayDetail();
	}
}
