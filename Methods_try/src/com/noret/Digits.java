package com.noret;

public class Digits {

	int num;

	public void CountOdd(int num) {
		int count = 0;
		while (num > 0) {
			int d = num % 10;
			if (d % 2 != 0) {
				count++;
			}
			num = num / 10;
		}
		System.out.println("Total odd Numbers are " + count);
	}

	public int mySquare(int num1) {
		int square = num1 * num1;
		return square;
	}

	public int myCube(int num2) {
		int cube = num2 * num2 * num2;
		return cube;
	}

	public int mySum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int greatest(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public boolean evenChk(int num3) {
		boolean isEven = true;
		if (num3 % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		return isEven;
	}

	public int revNum(int num4) {
		int rev = 0;

		while (num4 > 0) {
			int digit = num4 % 10;
			rev = rev * 10 + digit;
			num4 = num4 / 10;
		}
		return rev;
	}

	public boolean primChk(int num5) {
		if (num5 <= 1) {
			return false;
		}

		for (int i = 2; i < num5; i++) {
			if (num5 % i == 0) {
				return false;
			}

			
		}
		return true;
	}

	public int countDigit(int num6) {
		int count = 0;
		if (num6 == 0) {
			return 1;
		}

		while (num6 > 0) {
			count++;
			num6 = num6 / 10;
		}
		return count;
	}
}
