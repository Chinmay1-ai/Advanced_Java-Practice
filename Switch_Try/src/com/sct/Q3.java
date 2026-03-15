package com.sct;

public class Q3 {
	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("Excellent");
			break;

		case 'B':
			System.out.println("Good");
			break;

		case 'C':
			System.out.println("Average");
			break;

		case 'D':
			System.out.println("Below Average");
			break;

		case 'F':
			System.out.println("Fail");
			break;

		default:
			System.out.println("Invalid Grade");

		}
	}
}
