package com.overload;

public class Calculations1 {

	public void max(int a, int b) {
		if (a > b) {
			System.out.println("First is Greatest");
		} else {
			System.out.println("Second is Greatest");
		}
	}

	public void max(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("First is Greatest");
		} else if (b > a && b > c) {
			System.out.println("Second is Greatest");
		} else {
			System.out.println("Third is greatest");
		}
	}

	public static void main(String[] args) {

		Calculations1 c = new Calculations1();
		
		c.max(245, 345);
		c.max(10, 20, 30);

	}
}
