package com.oop;

public class EmployeeInfo {

	    // Global variables
	    int empId;               
		String empName;        
	    String department;
	    String designation;
	    String companyName;
	    float salary;
	    int experience;
	    String location;
	    boolean isPermanent;
	    char grade;

	    public static void main(String[] args) {

	        // Object Creation
	        EmployeeInfo emp = new EmployeeInfo();

	        int myId = emp.empId = 101;
	        String myName = emp.empName = "Rohit Sharma";
	        String myDept = emp.department = "IT";
	        String myDesig = emp.designation = "Software Developer";
	        String myComp = emp.companyName = "TCS";
	        float mySalary = emp.salary = 65000.50f;
	        int myExp = emp.experience = 3;
	        String myLoc = emp.location = "Pune";
	        boolean myStatus = emp.isPermanent = true;
	        char myGrade = emp.grade = 'A';

	        System.err.println("Employee Details...!");
	        System.out.println(" Employee ID = " + myId);
	        System.out.println(" Employee Name = " + myName);
	        System.out.println(" Department = " + myDept);
	        System.out.println(" Designation = " + myDesig);
	        System.out.println(" Company Name = " + myComp);
	        System.out.println(" Salary = " + mySalary);
	        System.out.println(" Experience = " + myExp + " years");
	        System.out.println(" Location = " + myLoc);
	        System.out.println(" Permanent Employee = " + myStatus);
	        System.out.println(" Grade = " + myGrade);
	    }
	}
	
	