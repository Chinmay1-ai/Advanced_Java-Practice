package com.sct;

public class Q4 {
	public static void main(String[] args) {
		int month = 4;

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The Month has 31 Days");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("This Month has 30 Days");
			break;

		case 2:
			System.out.println("This Month has 28 or 29 Days");
			break;

		default:
			System.out.println("Invalid Month");
			break;
		}
	}
}
