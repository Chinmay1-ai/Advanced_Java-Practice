package com.prac;

public class Q4 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("The Sum is " + sum);
	}
}
