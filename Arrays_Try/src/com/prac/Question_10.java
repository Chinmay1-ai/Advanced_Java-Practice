package com.prac;

import java.util.Arrays;

public class Question_10 {

	public static void main(String[] args) {

		int[] num = { 25, 55, 45, 20, 30, 45, 75 };

		Arrays.sort(num);
		System.out.println("Second Largest = "+num[num.length - 2]);
		System.out.println("Second Smallest = "+num[1]);
	}
}
