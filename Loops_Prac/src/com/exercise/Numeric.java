package com.exercise;

public class Numeric {

	public void mySeries(int num) {
		int i = 1;
		while (num >= i) {
			if (i == 5) {
				i++;
				continue;
			} else if (i == 7) {
				i++;
				continue;
			} else if (i % 3 == 0 && i % 4 == 0) {
				System.out.println("ThreeFour");
				i++;
			} else if (i % 3 == 0) {
				System.out.println("Three");
				i++;
			} else if (i % 4 == 0) {
				System.out.println("Four");
				i++;
			} else {
				System.out.println(i);
				i++;
			}
		}
	}

//		for (int i = 1; i <= num; i++) {
//
//			if (i == 5) {
//				continue;
//			} else if (i == 7) {
//				continue;
//			} else if (i % 3 == 0 && i % 4 == 0) {
//				System.out.println("ThreeFour");
//			} else if (i % 3 == 0) {
//				System.out.println("Three");
//			} else if (i % 4 == 0) {
//				System.out.println("Four");
//			} else {
//				System.out.println(i);
//			}
//		}
//	}

	public static void main(String[] args) {

		Numeric n = new Numeric();

		n.mySeries(100);
	}
}
