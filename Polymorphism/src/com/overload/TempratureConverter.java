package com.overload;

public class TempratureConverter {

	public double convert(double celcius) {
		return (celcius * 9 / 5) + 32;
	}

	public double convert(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9.0;
	}

	public static void main(String[] args) {

		TempratureConverter t = new TempratureConverter();

		System.out.println("Celcius to Fahrenheit");
		System.out.println(" 25 C = " + t.convert(25.0) + " F");

		System.out.println();

		System.out.println("Fahreheit to Celcius");
		System.out.println(" 77 F = " + t.convert(77) + " C");
		
		System.out.println("----------------------------------------------------------------");
		
		
		TempratureConverter t1 = new TempratureConverter();
		
		System.out.println("Celcius to Fahrenheit");
		System.out.println(" 30 C = " + t1.convert(30.0) + " F");
		
		System.out.println();
		
		System.out.println("Fahreheit to Celcius");
		System.out.println(" 86 F = " + t1.convert(86) + " C");
	}
}
