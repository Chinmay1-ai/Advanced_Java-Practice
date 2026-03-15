package com.exercise;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of Customer");
		String name = sc.nextLine();

		System.out.println("Enter the Age of Customer");
		int age = sc.nextInt();

		System.out.println("Enter the Customer ID");
		int id = sc.nextInt();

		System.out.println("Enter Initial Balance");
		double bal = sc.nextDouble();

		Customer c = new Customer(name, age, id);
		BankAccount acc = new BankAccount(bal);

		ATMService am = new ATMService();

		am.start(c, acc);
		sc.close();
	}
}
