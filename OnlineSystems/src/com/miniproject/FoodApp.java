package com.miniproject;

import java.util.Scanner;

public class FoodApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" 1. Order Food");
		System.out.println(" 2. Exit");
		int choice = sc.nextInt();

		if (choice == 1) {

			Payment payment;

			System.out.println("Choose Payment Method");
			System.out.println(" 1. UPI");
			System.out.println(" 2. Cash");

			int payChoice = sc.nextInt();

			if (payChoice == 1) {
				payment = new UpiPayment();
			} else {
				payment = new CashPayment();
			}

			FoodService service = new FoodService();
			service.placeOrder(payment);
		} else {
			System.out.println("Thank you for Visiting.........");
		}
		sc.close();
	}
}
