package com.dec;

import com.noret.Logic;

public class LogicMain {
	public static void main(String[] args) {

		Logic fibo = new Logic();
		Logic revv = new Logic();
		Logic prim = new Logic();
		Logic FactPri = new Logic(); 
		Logic paliLogic = new Logic();
		Logic isEven = new Logic();
		
		fibo.FiboSeries(0, 1);
		revv.RevNum(458565);
		prim.PrimChk(11);
		prim.PrimSeies();
		FactPri.FactPrint(7);
		paliLogic.PalindromeChk(115511);
		
		int result = 14;
		if(isEven.IsEven(result)==true) {
			System.out.println("The Number is Even");
		}else {
			System.out.println("The Nuber is not Even");
		}

	}
}
