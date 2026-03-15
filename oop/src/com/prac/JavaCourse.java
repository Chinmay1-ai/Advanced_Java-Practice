package com.prac;

public class JavaCourse extends CourseDetail {

	String version;

	JavaCourse(String courseName, int duration, String version) {
		super(courseName, duration); 
		this.version = version;
	}

	public void showJavaDetails() {
		System.out.println("Java Version: " + version);
	}
}
