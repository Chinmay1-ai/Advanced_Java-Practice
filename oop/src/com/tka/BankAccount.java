package com.tka;

public class BankAccount {

	long accountNo;
	String holderName;
	double balance;

	public void ShowDetails() {
		System.out.println("Account Number " + accountNo);
		System.out.println("Account Holder " + holderName);
		System.out.println("Balance " + balance);
	}
}
