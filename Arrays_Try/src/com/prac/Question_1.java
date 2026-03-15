package com.prac;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter your Names : ");
			names[i] = sc.nextLine();
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "] Names are : " + names[i]);
		}
		sc.close();
	}
}
