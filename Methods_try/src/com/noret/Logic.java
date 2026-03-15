package com.noret;

public class Logic {

	int first;
	int second;
	int num;
	int n;
	int rev = 0;
	int num1;
	int num2;
	int num3;

	public void FiboSeries(int first, int second) {
		System.out.print("Fibonici Series  =  " + first + " " + second + " ");

		for (int i = 3; i <= 10; i++) {
			int n = first + second;
			System.out.print(n + " ");
			first = second;
			second = n;
		}
	}

	public void RevNum(int num) {

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("");
		System.out.println("The Reversed Number is " + rev);
	}

	public void PrimChk(int num1) {
		boolean isPrime = true;

		if (num1 <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime == true) {
			System.out.println("The Number " + num1 + " is Prime");
		} else {
			System.out.println("The Number " + num1 + " is not Prime");
		}
	}

	public boolean IsEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void PrimSeies() {

		for (int num1 = 1; num1 <= 50; num1++) {
			boolean isPrime = true;
			if (num1 <= 1) {
				isPrime = false;
			}

			for (int i = 2; i < num1; i++) {
				if (num1 % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.print(" " + num1);

			}
		}
	}

	public void FactPrint(int num2) {
		int fact = 1;
		int i = 1;

		do {
			fact = fact * i;
			i++;
		} while (i <= num2);
		System.out.println();
		System.out.println("The Factorial of " + num2 + " is  =" + fact);
	}

	public void PalindromeChk(int num3) {

		int rev = 0;
		int temp = num3;
		while (num3 > 0) {

			int digit = num3 % 10;
			rev = rev * 10 + digit;
			num3 = num3 / 10;
		}

		if (rev == temp) {
			System.out.println("The number " + temp + " is Palindrome");
		} else {
			System.out.println("The Number " + temp + " is not Palindrome");
		}
	}
}
