package com.noret;

public class Palinchk {

	int num;
	int rev = 0;
//	int n = 112211;

	public void palinCheck(int num) {
		int n = num;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
		if (n == rev) {
			System.out.println("The number is Palindrome");
		} else {
			System.out.println("The Number is not Palindrome");
		}

	}
}
