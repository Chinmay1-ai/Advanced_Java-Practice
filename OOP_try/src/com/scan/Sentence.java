package com.scan;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence here ");
		String sen = sc.nextLine();

		System.out.println("Continue your Sentence here");
		String sen1 = sc.nextLine();

		String comp = sen + sen1;

		System.out.println("The Sentence of user is : " + comp);
	}
}
