package com.task;

import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[2][2];
		int arr1[][] = new int[2][2];
		int result[][] = new int[2][2];

		System.out.println("Enter First Array Numbers : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second Array Numbers : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr1  [i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int mul = arr[i][j] * arr1[i][j];

				if (mul % 2 == 0) {
					result[i][j] = mul;
				}
			}
		}

		System.out.println("........Even Numbers.......");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (result[i][j] != 0) {
					System.out.println(result[i][j] + " ");
				}
			}
		}
		sc.close();
	}
}
