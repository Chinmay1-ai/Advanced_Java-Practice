package com.tka;

import java.util.Scanner;

public class IntDemo {

	public static void main(String[] args) {

		int[] marks = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students Marks : ");

		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		for (int i = 0; i < marks.length; i++) {
			System.out.println(i + ". " + "Student Names are : " + marks[i]);
		}
		sc.close();
	}

}
