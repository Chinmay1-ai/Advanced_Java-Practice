package com.bank;

public class Account {

	private long accountNo;
	private double balance;

	public Account(long accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public double getBalance() {
		return balance;
	}

}
