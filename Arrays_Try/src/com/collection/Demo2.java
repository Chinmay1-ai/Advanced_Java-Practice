package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Demo2 {

	public static void main(String[] args) {
		
//		List<Integer> al = new ArrayList<Integer>();
//		Set<Integer> al = new LinkedHashSet<Integer>();
		Vector<Integer> al = new Vector<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------");
		
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("---------");
		
		Enumeration<Integer> e = al.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
