package com.practice;

public class Question_2 {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			int[] arr = new int[2];
			arr[5] = 10;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception");
		}
	}
}