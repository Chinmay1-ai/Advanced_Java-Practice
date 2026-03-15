
/* Count Prime Number in the Given Number */

package com.noret;

public class Primlogic {

	int num;

	public void PrimChk(int num) {

		int count = 0;

		if (num <= 1) {
			count = 0;
		} else {
			while (num > 0) {
				int digit = num % 10;

				if (digit == 2 || digit == 3 || digit == 5 || digit == 7 ) {
					System.out.print(" "+digit);
					count++;
				}

				num = num / 10;
			}
		}
		System.out.println();
		System.out.println("Number of Prime Digits are " + count);
	}
}
