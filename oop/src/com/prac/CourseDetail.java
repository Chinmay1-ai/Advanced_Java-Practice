package com.prac;

public class CourseDetail {

	String courseName;
	int duration;

	CourseDetail(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}

	public void showCourse() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " months");
	}
}
