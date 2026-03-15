package com.dec;

import com.noret.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calci = new Calculator();

		calci.myAddition(45, 62);
		calci.mySubtraction(22, 11);
		calci.myMultiplication(12, 13);
		calci.myDivision(66, 3);
		calci.mySquare(14);
	}
}
