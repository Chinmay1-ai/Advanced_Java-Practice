package com.prac;

public class Question_12 {

	public static void main(String[] args) {

		int[][] num = { { 12, 21, 23 }, { 45, 15, 32 }, { 55, 42, 62 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = num[i].length - 1; j >= 0; j--) {
				System.out.print(num[i][j] + " ");
			}
		}
	}
}
