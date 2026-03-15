
//Count how many EVEN digits are inside a number

package com.hard;

public class Q1 {
	public static void main(String[] args) {
		int num = 45865632;
		int count = 0;

		while (num > 0) {

			int digit = num % 10;          /* it will give the last number */

			if (digit % 2 == 0) {        /* if the last digit is even it will store and increase the counter */
				count++;
			}

			num = num / 10;              /* remove the last digit */
		}
		System.out.println("The Even Number inside the number is = " + count);

	}
}
