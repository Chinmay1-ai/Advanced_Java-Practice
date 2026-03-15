package com.prac;

import java.util.Arrays;

public class Question_2 {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 70, 50, 45 };
		int sum = 0;

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.print(" "+num[i]);
		}
		System.out.println();
		System.out.println("The Sum of All Numbers are :  " + sum);
	}
}
