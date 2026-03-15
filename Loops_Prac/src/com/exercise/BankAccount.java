package com.exercise;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
		System.out.println("Amount has been Deposited : " + amount);
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount has been Withdrawn : " + amount);
		} else {
			System.out.println("Insufficient Balance or Invalid Amount");
		}
	}

	public double getBalance() {
		if (balance < 500) {
			System.out.println("Low Balance....");
		}
		return balance;
	}
}
