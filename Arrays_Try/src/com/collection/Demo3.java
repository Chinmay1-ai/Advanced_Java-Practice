package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo3 {
	

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
//		TreeMap<Integer, String> map = new TreeMap<Integer, String>();       /* key null not allowed */

		map.put(null, "Name");
		map.put(121, "Chinmay");
		map.put(122, "Priya");
		map.put(123, "Bhavik");
		map.put(124, "Malvi");
		map.put(125, "Shubham");

		map1.put(126, "Rahul");
		map1.put(127, "Vaishanavi");
		map1.put(128, "Swaraj");
		map.putAll(map1);
		System.out.println(map.get(127));
		
		System.out.println(map.containsKey(127));
		
		System.out.println(map.containsValue("Malvi"));
		
		System.out.println(map.remove(126));
		
		System.out.println(map.size());
		
//		System.out.println(map);

		for (Map.Entry<Integer, String> s : map.entrySet()) {
			System.out.println(s.getKey() + "   " + s.getValue());
		}
	}
}
