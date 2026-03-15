package com.prac;

public class DataScienceCourse extends CourseDetail {

    String tools;

    DataScienceCourse(String courseName, int duration, String tools) {
        super(courseName, duration);
        this.tools = tools;
    }

    public void showTools() {
        System.out.println("Tools Used: " + tools);
    }
}
