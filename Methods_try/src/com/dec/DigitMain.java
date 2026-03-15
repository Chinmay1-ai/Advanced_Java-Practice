package com.dec;

import com.noret.Digits;

public class DigitMain {
	public static void main(String[] args) {
       
		Digits digit = new Digits();
		
		digit.CountOdd(15697835);
		System.out.println("The Square is "+(digit.mySquare(12)));
		System.out.println("The Cube is "+(digit.myCube(10)));
		System.out.println("The sum is "+(digit.mySum(121, 150)));
		System.out.println("The Greatest Number is "+(digit.greatest(110, 220, 5)));
		System.out.println(digit.evenChk(14));
		System.out.println("The is "+(digit.revNum(548565)));
		System.out.println(digit.countDigit(121543));
		
		int result = 11;
		
		if(digit.primChk(result)==true) {
			System.out.println("The Number is Prime");
		}else {
		System.out.println("The Number is not Prime");
		}
	}
}
