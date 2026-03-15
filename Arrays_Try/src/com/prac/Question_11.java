package com.prac;

public class Question_11 {

	public static void main(String[] args) {

		int[][] num = { { 12, 21, 23 }, { 45, 15, 32 }, { 55, 42, 62 } };
		int[][] copy = new int[num.length][num[0].length];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				copy[i][j] = num[i][j];
				System.out.print(copy[i][j] + " ");
			}
		}
	}
}
