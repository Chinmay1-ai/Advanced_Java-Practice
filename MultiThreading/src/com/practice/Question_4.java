package com.practice;

public class Question_4 {
	public static void main(String[] args) {
		try {
			System.out.println("Try block");
		} finally {
			int a = 10 / 0;
		}
	}
}
