
//Print ALL 3-digit Armstrong Numbers

package com.hard;

public class Q2 {
	public static void main(String[] args) {
		for (int num = 152; num <= 500; num++) {

			int n = num;
			int original = num;
			int sum = 0;

			while (n > 0) {

				int digit = n % 10;
				sum += digit * digit * digit;
				n /= 10;
			}
			if (sum == original) {
				System.out.println(original + " is Armstrong");
			}
		}
	}
}
