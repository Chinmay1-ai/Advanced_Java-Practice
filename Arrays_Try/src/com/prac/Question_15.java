package com.prac;

public class Question_15 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 4, 40, 30 };

		int largest = arr[0];                  /* take one value for comparison */
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {        /* start from second */
			if (arr[i] > largest) {       
				secondLargest = largest;
				largest = arr[i];                    /* set the current value as largest */
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest = " + secondLargest);
	}
}