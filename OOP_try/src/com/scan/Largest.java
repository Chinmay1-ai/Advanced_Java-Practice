package com.scan;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int a = sc.nextInt();

		System.out.println("Enter the Second Number");
		int b = sc.nextInt();

		System.out.println("Enter the Third Number");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("The First Number is Greatest = " + a);
		} else if (b > a && b > c) {
			System.out.println("The Second Number is Greatest = " + b);
		} else {
			System.out.println("The Third Number is Greatest = " + c);
		}
	}
}
