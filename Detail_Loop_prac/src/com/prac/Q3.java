//package com.prac;
//
//public class Q3 {
//	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//
//		while (i <= 30) {
//			sum += i;
//			i++;
//		}
//		System.out.println("The sum is = " + sum);
//	}
//}

package com.prac;

public class Q3 {
	public static void main(String[] args) {
		int Totalsum = 0;
		int i = 1;
		while (i <= 30) {
			int num = i;
			int digitSum = 0;

			while (num > 0) {
				digitSum += num % 10;
				num /= 10;
			}
			Totalsum += digitSum;
			i++;
		}
		System.out.println("The total digit sum is = " + Totalsum);
	}
}