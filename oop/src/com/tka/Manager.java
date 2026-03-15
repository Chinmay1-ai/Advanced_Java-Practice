package com.tka;

public class Manager extends Employee{
	
	    int teamSize;

	    public void showManagerDetails() {
	        displayInfo(); 
	        System.out.println("Team Size: " + teamSize);
	    }
	}
