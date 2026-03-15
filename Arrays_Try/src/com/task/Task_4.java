package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_4 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(40);
		list.add(50);
		list.add(80);
		list.add(20);

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(20);
		list1.add(10);
		list1.add(50);
		list1.add(60);
		list1.add(45);

		System.out.println("1st List" + list);
		Collections.sort(list);
		System.out.println("Sorted 1st List = " + list);
		System.out.println("----------------------------");

		System.out.println("2nd List" + list1);
		Collections.sort(list1);
		System.out.println("Sorted 2nd List = " + list1);
		System.out.println("------------------------------");

		int totalSum = 0;

		for (int i = 0; i < list.size(); i++) {
			totalSum = totalSum + list.get(i);
		}

		for (int i = 0; i < list1.size(); i++) {
			totalSum = totalSum + list1.get(i);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " + " + list1.get(i) + " = " + (list.get(i) + list1.get(i)));
		}

		System.out.println("------------------------------");
		System.out.println("The Total of both the list is = " + totalSum);
	}
}