package com.task;

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		int sum = 0;      //set sum initially zero

		System.out.println("Enter 5 Numbers : ");       // take 5 numbers from the user

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();             // storing value one by one 
		}

		for (int i = 0; i < 5; i++) {
			sum += arr[i];                     // adding value in sum one by one 
		}

		System.out.println("The Sum is = " + sum);       //print the sum
	}
}
