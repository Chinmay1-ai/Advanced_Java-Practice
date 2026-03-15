package com.prac;

import java.util.Arrays;

public class Question_8 {

	public static void main(String[] args) {

		int[] num = { 25, 65, 45, 20, 30 , 45 , 65};

		Arrays.sort(num);
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.print(" " + num[i]);
			}
		}
	}
}
