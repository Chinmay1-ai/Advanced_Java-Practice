package com.scan;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 3 digit number");
		int num = sc.nextInt();

		boolean isPrim = true;
		if (num <= 1) {
			isPrim = false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrim = false;
				break;
			}
		}
		int total = 0;
		if (isPrim == true) {
			while (num > 0) {
				int digit = num % 10;
				total = digit + total;
				num = num / 10;
			}
			System.out.println("The Numberr is Prime");
			System.out.println("The Addition of all three Number is = " + total);

		} else {
			System.out.println("The Number is not Prime");
		}

	}

}
