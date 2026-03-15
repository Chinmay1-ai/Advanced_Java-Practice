package com.overriding;

public class Developer extends Employee {

	@Override
	public void work() {
		System.out.println("Developer is developing the Application");
	}

	public static void main(String[] args) {
		
	
	Manager e1 = new Manager();
	Employee e2 = new Employee();
	Developer e3 = new Developer();

	e1.work();
	e2.work();
	e3.work();
	}       
}
