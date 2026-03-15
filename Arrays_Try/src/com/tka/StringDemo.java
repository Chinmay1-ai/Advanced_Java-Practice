package com.tka;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		String[] names = new String[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students Names : ");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ". " + "Student Names are : " + names[i]);
		}
		sc.close();
	}

}
