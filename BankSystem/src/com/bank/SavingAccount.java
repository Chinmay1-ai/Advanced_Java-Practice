package com.bank;

public class SavingAccount extends Account {

	private double interestRate = 5.5;

	public SavingAccount(long accountNo, double balance) {
		super(accountNo, balance);
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void savingAccount() {
		System.out.println("......Account Details........");
		System.out.println("Account No. = "+getAccountNo());
		System.out.println("Balance = "+getBalance());
		System.out.println("Rate of Interest for Saving Account is 5.5");
		System.out.println("Withdraw Limit for Saving Account is upto 50000");
	}
}
