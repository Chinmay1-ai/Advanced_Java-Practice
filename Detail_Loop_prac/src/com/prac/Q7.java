package com.prac;

public class Q7 {
	public static void main(String[] args) {
		int num = 5;
		long fact = 1;        /* factorial always start from 1 */
		int i = 1;            /* Counter will Start from 1 */

		do {
			fact = fact * i; 
			/*
			* fact = 1 * 1 = 1 
			* fact = 1 * 2 = 2 
			* fact = 2 * 3 = 6 
			* fact = 6 * 4 = 24 
			* fact = 24 * 5 = 120
		   */
			i++;
		} while (i <= num);
		System.out.println("Factorial of 5 is " + fact);
	}
}