package com.sct;

public class Q6 {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		char op = '*';

		switch (op) {

		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("Invalid Opeartion");
			break;
		}
	}
}
