package com.scan;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number : ");
		int a = sc.nextInt();

		System.out.println("Enter the Second Number : ");
		int b = sc.nextInt();

		System.out.println("The Multiplication of " + a + " * " + b + " is : " + (a * b));
		System.out.println("The Division of " + a + " / " + b + " is : " + (a / b));
		System.out.println("The Square of First Number is " + (a * a));
		System.out.println("The Square of Second Number is " + (b * b));
		System.out.println("The Cube of Second Number is " + (a * a * a));
		System.out.println("The Cube of Second Number is " + (b * b * b));

	}
}
