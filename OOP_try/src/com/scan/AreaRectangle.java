package com.scan;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length of Rectangle");
		int rect = sc.nextInt();

		System.out.println("Enter the Breadth of Rectangle");
		int brea = sc.nextInt();

		int area = rect * brea;

		System.out.println("Area of Rectangle is : " + area);
	}
}
