package com.overriding;

public class Manager extends Employee{
	
	@Override
	public void work() {
		System.out.println("Manager is Managing the Team");
	}

}
