package com.overload;

public class Student {

	int id;
	String name;

	public Student(int id) {
		this.id = id;
		System.out.println(id);
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Student s1 = new Student(12);
		Student s = new Student(0, null);
		Student s2 = new Student(121, "Chinmay");
	}
}
