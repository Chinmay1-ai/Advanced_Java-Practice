package com.prac;

public class Question_5 {

	public static void main(String[] args) {

		int[] num = { 10, 50, 25, 32, 56, 63 };
		int[] num1 = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			System.out.print((num1[i] = num[i]) + " ");
		}

	}
}
