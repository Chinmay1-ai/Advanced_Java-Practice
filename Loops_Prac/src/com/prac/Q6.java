package com.prac;

public class Q6 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			int num = i;
			int digitSum = 0;
			while (num > 0) {
				digitSum += num % 10;
				num /= 10;
			}
			sum += digitSum;
		}
		System.out.println("The sum is " + sum);
	}
}