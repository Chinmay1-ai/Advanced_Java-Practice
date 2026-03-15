
//Print the number from 1 to 50 with Even/Odd Label

package com.prac;

public class Q1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("The Number is Even = " + i);
			} else {
				System.out.println("The number is Odd = " + i);
			}
		}
	}
}
