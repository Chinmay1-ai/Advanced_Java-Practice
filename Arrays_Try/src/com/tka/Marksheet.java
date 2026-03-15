package com.tka;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = new String[5];
		int[] marks = new int[5];

		for (int i = 0; i < names.length; i++) {

			System.out.println("Enter your Name : " + (i + 1));
			names[i] = sc.nextLine();

			System.out.println("Enter your Marks : " + (i + 1));
			marks[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println(".....Student Details.....");

		int highest = marks[0];
		String topper = names[0];

		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ") " + names[i] + " = " + (marks[i]));
			if (marks[i] > 35) {
				System.out.println(names[i] + " is Passed");
			} else {
				System.out.println(names[i] + " is Failed");
			}
			if (marks[i] > highest) {
				highest = marks[i];
				topper = names[i];
			}
		}
		System.out.println("Highest Marks : " + highest);
		System.out.println("Topper is " + topper);
		sc.close();
	}

}
