package com.bank;

//additional benifits and higher limits


public class PremiumAccount extends SavingAccount{

	private double ROI = 7.2;
	private double withdrawLimit;

	public PremiumAccount(long accountNo, double balance) {
		super(accountNo, balance);
	}


	public double getROI() {
		return ROI;
	}


	public double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void premiuimAccount() {
		System.out.println("......Account Details........");
		System.out.println("Account No. = "+getAccountNo());
		System.out.println("Balance = "+getBalance());
		System.out.println("Rate of Interest for Premium Account is 7.2");
		System.out.println("Withdraw Limit for Premium Account is upto 100000");
	}

}
