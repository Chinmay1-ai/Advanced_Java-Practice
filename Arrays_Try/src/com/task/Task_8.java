package com.task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		
		System.out.println("Enter 5 Number : ");
		
		for(int i = 0 ; i < list.size() ; i++) {
			list.add(sc.nextInt());
		}
		for(int j = 0 ; j < list.size() ; j++) {
			
		}
		
		System.out.println(list);
		sc.close();
	}
}
