package com.tka;

	public class EmployeeMain {

	    public static void main(String[] args) {

	        // Manager Object
	        Manager m = new Manager();
	        m.name = "Rohit";
	        m.id = 101;
	        m.department = "Sales";
	        m.teamSize = 5;

	        System.err.println("----- Manager Details -----");
	        m.showManagerDetails();


	        // Developer Object
	        Developer d = new Developer();
	        d.name = "Virat";
	        d.id = 102;
	        d.department = "IT";
	        d.programmingLanguage = "Java";

	        System.err.println("----- Developer Details -----");
	        d.showDeveloperDetails();
	    }
	}
