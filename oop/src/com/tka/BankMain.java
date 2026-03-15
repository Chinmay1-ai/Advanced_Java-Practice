package com.tka;

public class BankMain {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount();

		sa.accountNo = 5452524524525l;
		sa.holderName = "Chinmay Pawar";
		sa.balance = 50000;

		System.err.println(".....Saving Account Detail.....");
		sa.ShowDetails();
		sa.ShowSavingInfo();

		CurrentAccount ca = new CurrentAccount();

		ca.accountNo = 9654824524525l;
		ca.holderName = "Rohit Sharma";
		ca.balance = 500000;

		System.err.println(".....Current Account Detail.....");
		ca.ShowDetails();
		ca.ShowCurrentinfo();
	}
}
