package com.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> fruits = new ArrayList<>();

		System.out.println("Enterr 5 Fruits : ");

		for (int i = 0; i < 5; i++) {
			fruits.add(sc.nextLine());
		}

		for (String fruit : fruits) {

			int vowels = 0;
			int consonants = 0;

			for (int i = 0; i < fruit.length(); i++) {
				char ch = Character.toLowerCase(fruit.charAt(i));

				if (ch >= 'a' && ch <= 'z') {

					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						vowels++;
					} else {
						consonants++;
					}
				}
			}

			System.out.println("Fruit: " + fruit);
			System.out.println("Vowels: " + vowels);
			System.out.println("Consonants: " + consonants);
			System.out.println("--------------------");
		}
		sc.close();
	}
}
