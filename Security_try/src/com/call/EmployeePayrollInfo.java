package com.call;

import com.declare.EmployeePayroll;

public class EmployeePayrollInfo {

	public static void main(String[] args) {
		
		EmployeePayroll e1 = new EmployeePayroll();
		
		e1.setSalary(50000);
		e1.setBonus(5000);
		e1.setPf(5000);
		e1.setAttendance(90);
		e1.setDepartment("Development");
		e1.setEmployeeId(151);
		e1.setDesignation("Backend Developer");
		
		System.out.println("Employee Information !!!!");
		System.out.println("");
		System.out.println("The Salary of Employee is "+(e1.getSalary()));
		System.out.println("The Bonus of Employee is "+e1.getBonus());
		System.out.println("The Provident Fund Employee get is "+e1.getPf());
		System.out.println("The Attendance of Employee is "+e1.getAttendance()+"%");
		System.out.println("The Department of Employee is "+e1.getDepartment());
		System.out.println("The ID of Employee is "+e1.getEmployeeId());
		System.out.println("The Designation of Employee is "+e1.getDesignation());
		
	}
}
