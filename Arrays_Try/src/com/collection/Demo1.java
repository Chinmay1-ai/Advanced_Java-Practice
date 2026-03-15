package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
//		LinkedList<Integer> ll = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.remove(3);
		System.out.println(al.size());
		System.out.println("------------------------------------");
		for (Integer inte : al) {
			System.out.println(inte);
		}

		System.out.println("------------------------------------");
		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.addAll(al);
		
		for (Integer integer : al1) {
			System.out.println(integer);
		}
	}
}
