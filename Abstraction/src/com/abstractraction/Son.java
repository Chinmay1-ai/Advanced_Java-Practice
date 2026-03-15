package com.abstractraction;

public class Son implements Mother , Father{

	@Override
	public void cooking() {
		System.out.println("Khichadi");
	}
	
	@Override
	public void driving() {
		System.out.println("Dads Teachs me Car");
	}
}
