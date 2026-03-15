package com.ecm;

public class BankAccount {

	private String accHolder;
	private int accBalance;
	private int accNo;
	int amount;
	
	BankAccount(int accBalance){
		if(accBalance > 0) {
			this.accBalance=accBalance;
		}
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccBalance() {
		return accBalance;
	}

//	deposit(), withdraw(), getBalance().

	public void Withdraw(int amount , String accHolder) {
		
        if(accBalance > amount) {
			System.out.println("The Amount "+amount+" Has been Withdrawn");
		}else {
			System.out.println("Low Balance....!!");
		}
		
        System.out.println("The Remaining Balance in "+accHolder+ " accout is "+(accBalance-amount));
        System.out.println("-----------------------------------------------------------");
					
	}

	public void Deposit(String accHolder, int accNo , int amount) {
        
		System.out.println("The Amount "+amount+" has been Deposited");
		System.out.println("The Balance in "+accHolder+" is "+(accBalance+amount));
        System.out.println("-----------------------------------------------------------");

	
	}

	
	public void GetBalance(String accHolder , int accNo) {
			
		System.out.println("The Balance in "+accHolder+" is "+accBalance);
        System.out.println("-----------------------------------------------------------");

	}

}
