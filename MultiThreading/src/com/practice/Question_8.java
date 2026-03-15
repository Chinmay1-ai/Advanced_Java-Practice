package com.practice;

public class Question_8 {

	public static void main(String[] args) {

		String name = "nayan";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		
		if(name.equals(rev)) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
		System.out.println("Orignal Name : " + name);
		System.out.println("Reverse Name : " + rev);
	}
}
