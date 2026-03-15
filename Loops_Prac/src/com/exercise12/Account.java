package com.exercise12;

public class Account {

	int accountNumber;
	String holderName;
	double balance;

	public Account(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposited Successfully");
		} else {
			System.out.println("Invalid Deposit Amount");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Amount");
			return;
		}

		if (balance - amount < 500) {
			System.out.println("Withdrawal Denied! Minimum balance 500 required");
		} else {
			balance = balance - amount;
			System.out.println("Amount Withdrawn Successfully");
		}
	}

	public void checkBalance() {
		System.out.println("Current Balance = " + balance);

		if (balance < 1000) {
			System.out.println("⚠ Low Balance Warning");
		}
	}
}
