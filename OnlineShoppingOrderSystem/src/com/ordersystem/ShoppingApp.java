package com.ordersystem;

import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Name:");
		String name = sc.nextLine();

		System.out.println("Enter Mobile Number:");
		long mobile = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter Address:");
		String address = sc.nextLine();

		Customer c = new Customer(name, mobile, address);

		System.out.println("Choose Order Type:");
		System.out.println("1. Online Order");
		System.out.println("2. Store Pickup");
		int orderChoice = sc.nextInt();

		OrderService service;

		if (orderChoice == 1) {
			service = new OnlineOrderService();
		} else {
			service = new StorePickupService();
		}

		service.placeOrder();

		System.out.println("Enter number of items:");
		int items = sc.nextInt();

		double bill = service.calculateBill(items);
		System.out.println("Total Bill: ₹" + bill);

		System.out.println("Choose Payment Method:");
		System.out.println("1. UPI");
		System.out.println("2. Card");
		int payChoice = sc.nextInt();

		Payment p;

		if (payChoice == 1) {
			p = new UpiPayment();
		} else {
			p = new CashPayment();
		}

		service.makePayment(p, bill);

		sc.close();
	}
}
