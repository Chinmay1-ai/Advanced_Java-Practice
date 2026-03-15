package com.ecm;

public class Employee {

	private int empId;
	private String empName;
	private int salary;

	Employee(String empName, int salary) {
		this.empName = empName;
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.err.println("Invalid Salary! Salary must be greater than 0.");
		}
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}

	public void Increment() {
		
		int incre = (salary * 10) / 100;
		int finalSalary = salary + incre;
		
		System.out.println("The Incremented Salary is "+finalSalary);
	}
}
