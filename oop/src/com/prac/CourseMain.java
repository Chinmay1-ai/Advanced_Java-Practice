package com.prac;

public class CourseMain {
	public static void main(String[] args) {

		JavaCourse jc = new JavaCourse("Java Development", 6, "JDK 21");
		DataScienceCourse dc = new DataScienceCourse("Data Science", 12, "Python, SQL, ML");

		System.out.println("----- JAVA COURSE -----");
		jc.showCourse();
		jc.showJavaDetails();

		System.out.println("\n----- DATA SCIENCE COURSE -----");
		dc.showCourse();
		dc.showTools();
	}
}
