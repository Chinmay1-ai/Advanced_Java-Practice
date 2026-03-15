package com.sct;

public class Q1 {
	public static void main(String[] args) {
		String season = "Winter";

		switch (season) {

		case "Winter":
			System.out.println("November, December , January , February");
			break;
		case "Summer":
			System.out.println("March , April , May , June");
			break;
		case "Spring":
			System.out.println("July , August , Semtember , Octomber");
			break;

		default:
			System.out.println("Invalid Seasn.......");
			break;

		}
	}
}
