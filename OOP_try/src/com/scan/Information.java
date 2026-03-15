package com.scan;

import java.util.Scanner;

public class Information {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.println("Entr your Name");
		String name = sc.nextLine();

		System.out.println("Your Name is " + name);
		System.out.println("Your Age is " + age);

	}
}
