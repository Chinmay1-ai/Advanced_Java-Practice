package com.sct;

public class Q5 {
	public static void main(String[] args) {
		char ch = 'B';

		switch (ch) {

		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");

		default:
			System.out.println("Consonant");
			break;
		}
	}
}
