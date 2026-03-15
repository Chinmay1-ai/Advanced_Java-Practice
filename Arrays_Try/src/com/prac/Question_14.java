package com.prac;

public class Question_14 {

	public static void main(String[] args) {

		String name = "Chinmay";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int count = 0;

		char[] ch = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			ch[i] = name.charAt(i);
		}

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (ch[i] == vowels[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("The Number of Vowels in " + name + " String is " + count);
	}
}
