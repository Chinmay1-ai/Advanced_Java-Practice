package com.prac;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {

		int[][] num = { { 12, 21, 23 }, { 45, 15, 32 }, { 55, 42, 62 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				Arrays.sort(num[i]);
				System.out.print(num[i][j] + " ");
			}
		}
	}
}
