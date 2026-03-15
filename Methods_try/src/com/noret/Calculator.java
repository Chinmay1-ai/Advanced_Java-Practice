package com.noret;

public class Calculator {

	public void myAddition(int a, int b) {
		System.out.println("The Sum of " + a + " + " + b + " is = " + (a + b));
	}

	public void mySubtraction(int a, int b) {
		System.out.println("The Subtraction of " + a + " - " + b + " is = " + (a - b));
	}

	public void myMultiplication(int a, int b) {
		System.out.println("The Multiplication of " + a + " * " + b + " is = " + (a * b));
	}

	public void myDivision(int a, int b) {
		System.out.println("The Division of " + a + " / " + b + " is = " + (a / b));
	}

	public void mySquare(int num) {
		System.out.println("The Square of " + num + " is = " + (num * num));
	}
}
