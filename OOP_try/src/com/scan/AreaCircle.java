package com.scan;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius of Circle");
		int radius = sc.nextInt();

		double area = 3.14 * radius * radius;

		System.out.println("The Area of Circle is " + area);
	}
}
