package com.scan;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principal");
		int prin = sc.nextInt();

		System.out.println("Enter the Rate");
		int rate = sc.nextInt();

		System.out.println("Enter the Time in Second");
		float time = sc.nextFloat();

		double si = (prin * rate * time) / 100;

		System.out.println("Simple Interest : " + si);
	}
}
