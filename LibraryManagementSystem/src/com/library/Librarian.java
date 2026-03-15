package com.library;

public class Librarian extends Person {

	private int employeeId;
	private String shift;

	public Librarian(int employeeId, String shift, String name, int age, String gender) {
		super(name, age, gender);
		this.employeeId = employeeId;
		this.shift = shift;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getShift() {
		return shift;
	}
}
