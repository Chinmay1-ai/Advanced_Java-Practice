package com.overload;

public class Calculator1 {

	public void add(int a, int b) {
		System.out.println("The Addition is : " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("The Addition is : " + (a + b + c));
	}

	public static void main(String[] args) {

		Calculator1 c = new Calculator1();

		c.add(10, 25);
		c.add(25, 25, 30);
	}
}
