package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> i = new ArrayList<String>();

		i.add("Chinmay");
		i.add("Male");
		i.add("Pune");
		i.add("Java Developer");
		
	
		for (String info : i) {
			System.out.println(info);
		}
		
		
		List<String> i1 = new ArrayList<String>(i);
		System.out.println(i1.isEmpty());
		System.out.println(i1);
		
		System.out.println(i1.get(2));
		
		
	}
}