package com.task;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;       //set the initial sum as zero

		System.out.println("Enter 5 Numbers");      //take the 5 numbers from the user
		
		for (int i = 1; i <= 5; i++) {
			int num = sc.nextInt();                //storing all 5 numbers one by one in num
			sum += num;                           // adding the value in sum one by one
		}
		System.out.println("The sum of all 5 number is " + sum);   //print the sum
		sc.close();
	}
}
