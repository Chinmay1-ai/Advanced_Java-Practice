package com.prac;

import java.util.Arrays;

public class Question_7 {

	public static void main(String[] args) {

		int[] num = { 25, 26, 10, 45, 65 };

		Arrays.sort(num);

		System.out.print("Ascending order = ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println();

		System.out.print("Descending order = ");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
