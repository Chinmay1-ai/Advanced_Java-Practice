package com.prac;

public class Q9 {
	public static void main(String[] args) {

		long num = 54651346513L;

		long n = Math.abs(num);             /* Treat the negative number as positive */

		int count = 0;

		if (n == 0) {
			count = 1;
		} else {
			while (n > 0) {
				count++;
				n /= 10;
			}
		}
		System.out.println(count);
	}
}
