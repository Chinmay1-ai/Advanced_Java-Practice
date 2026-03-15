package com.sct;

public class Q9 {
	public static void main(String[] args) {

		char color = 'Y';

		switch (color) {

		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		default:
			System.out.println("Invalid color Type");
			break;
		}
	}
}
