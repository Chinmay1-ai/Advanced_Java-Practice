package com.scan;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number for addition");
		int a = sc.nextInt();

		System.out.println("Enter the Second Number for addition");
		int b = sc.nextInt();

		int c = a + b;

		System.out.println("The addition of " + a + " + " + b + " is " + c);

	}
}
