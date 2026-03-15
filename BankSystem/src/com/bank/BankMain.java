package com.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number : ");
		long myAcc = sc.nextLong();

		System.out.println("Enter the Initial Balance for the Account : ");
		double myBal = sc.nextDouble();

		System.out.println("Enter the Account Type");
		System.out.println("1. Saving Account");
		System.out.println("2. Premium Account");

		int choice = sc.nextInt();

		if (choice == 1) {
			SavingAccount saving = new SavingAccount(myAcc, myBal);
			saving.savingAccount();
		} else if (choice == 2) {
			PremiumAccount premium = new PremiumAccount(myAcc, myBal);
			premium.premiuimAccount();
		} else {
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
}
