package com.string;

public class Exercise {

	public static void main(String[] args) {

		String name = "Kiran";
		String name1 = " Academy";
		String sen = "I Love Java Language";

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println(name.concat(name1));
		if (sen.contains("Java")) {
			System.out.println("Contain Java Word");
		} else {
			System.out.println("Not have Java Word");
		}
		System.out.println("First Word is = " + sen.charAt(0));
		System.out.println("Last Word is = " + sen.charAt(sen.length() - 1));
	}
}
