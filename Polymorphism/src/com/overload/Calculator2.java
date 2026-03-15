package com.overload;

public class Calculator2 {

	public void multiply(int a, int b) {
		System.out.println("The Multiplication is : " + (a * b));
	}

	public void multiply(double a, double b) {
		System.out.println("The Multiplication is : " + (a * b));
	}

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();

		c1.multiply(10, 25);
		c1.multiply(656294.1616, 165415.65161);
	}
}
