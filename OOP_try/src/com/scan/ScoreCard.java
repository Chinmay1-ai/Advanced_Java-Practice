package com.scan;

import java.util.Scanner;

public class ScoreCard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ScoreDetail s1 = new ScoreDetail();

		System.out.println("Enter the Marks of Math");
		int math = sc.nextInt();

		System.out.println("Enter the Marks of Physics");
		int physics = sc.nextInt();

		System.out.println("Enter the Marks of Chemistry");
		int chemistry = sc.nextInt();

		System.out.println("Enter the Marks of Graphics");
		int graphics = sc.nextInt();

		System.out.println("Enter the Marks of Mechanics");
		int mechanics = sc.nextInt();
		
		
        s1.setMath(math);
        s1.setPhysics(physics);
        s1.setChemistry(chemistry);
        s1.setGraphics(graphics);
        s1.setMechanics(mechanics);
		s1.myResult();

		sc.close();
	}
}
