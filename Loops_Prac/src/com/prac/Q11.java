package com.prac;

public class Q11 {
	public static void main(String[] args) {

		int n = 2; // prime numbers start from 2

		while (n <= 100) {

			int i = 2;
			boolean isPrime = true;

			while (i <= n / 2) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}

			if (isPrime) {
				System.out.println(n);
			}

			n++;
		}
	}
}
