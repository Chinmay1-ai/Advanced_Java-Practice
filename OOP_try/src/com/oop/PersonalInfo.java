package com.oop;

public class PersonalInfo {
	
	    String fullName;
	    int age;
	    String city;
	    String email;
	    long mobile;
	    String education;
	    float height;
	    float weight;
	    char gender;
	    boolean isMarried;

	    public static void main(String[] args) {

	        PersonalInfo person = new PersonalInfo();

	        String myName = person.fullName = "Chinmay Pawar";
	        int myAge = person.age = 22;
	        String myCity = person.city = "Pune";
	        String myEmail = person.email = "chinmay@gmail.com";
	        long myMobile = person.mobile = 7263840040L;
	        String myEdu = person.education = "B.Tech CSE";
	        float myHeight = person.height = 5.9f;
	        float myWeight = person.weight = 98.5f;
	        char myGender = person.gender = 'M';
	        boolean myStatus = person.isMarried = false;

	        System.err.println("Personal Information...!");
	        System.out.println(" Full Name = " + myName);
	        System.out.println(" Age = " + myAge);
	        System.out.println(" City = " + myCity);
	        System.out.println(" Email = " + myEmail);
	        System.out.println(" Mobile = " + myMobile);
	        System.out.println(" Education = " + myEdu);
	        System.out.println(" Height = " + myHeight);
	        System.out.println(" Weight = " + myWeight);
	        System.out.println(" Gender = " + myGender);
	        System.out.println(" Married = " + myStatus);
	    }
	}


