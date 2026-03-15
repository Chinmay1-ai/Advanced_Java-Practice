package com.prac;

public class Question_4 {

	public static void main(String[] args) {

		int[] num = { 20, 40, 10, 15, 55, 65 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print("This are the Even numbers : ");
				System.out.println(num[i]);
			} else {
				System.out.print("This are the Odd numbers : ");
				System.out.println(num[i]);
			}
		}
	}
}
