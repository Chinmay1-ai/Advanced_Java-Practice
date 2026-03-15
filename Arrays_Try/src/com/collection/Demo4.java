package com.collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();         /* insertion order is not maintain & all 3 is possible */
//		Set<String> s = new LinkedHashSet<String>();   /* insertion order maintain & duplicates not allowed & only iterator is possible */
//		Set<String> s = new TreeSet<String>();         /* null is not allowed & insertion order is maintain &  */

		s.add("Chinnmay");
		s.add("Bhavik"); /* duplicates not allowed */
		s.add("Malvi");
		s.add("Priya");
		s.add(null);
		s.add(null);    /* only one null is accepted */
		s.add("Om");

		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("---------");

//		ListIterator<String> litr = s.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());
//		}
//		
//		System.out.println("---------");
//		
//		Enumeration<String> e = s.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}

	}
}
