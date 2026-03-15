package com.exercise;

import java.util.Scanner;

public class ATMService {

	Scanner sc = new Scanner(System.in);

	public void start(Customer c, BankAccount acc) {

		System.out.println("Welcome " + c.getName());
		System.out.println("Customer ID " + c.getCustomerId());

		while (true) {

			System.out.println(".....Bank Services.....");
			System.out.println(" 1. Check Balance");
			System.out.println(" 2. Deposit");
			System.out.println(" 3. Withdraw");
			System.out.println(" 4. Exit");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println(" Current Balance : " + acc.getBalance());
			} 
			else if (choice == 2) {
				System.out.println("Enter Amount to Deposit");
				double amt = sc.nextDouble();
				acc.deposit(amt);
			} 
			else if (choice == 3) {
				System.out.println("Enter Amount to Withdraw");
				double amt = sc.nextDouble();
				acc.withdraw(amt);
			} 
			else if (choice == 4) {
				System.out.println("Thank you for visiting Bank.......");
				break;
			} 
			else {
				System.out.println("Invalid Choice");
			}
		}
	}

}
