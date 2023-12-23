package com.practice.codes;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		//Java Program to find factorial of a number
		int num = 20;
		long factorial = num;
		
		for(int i=num-1; i>0; i--) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of " + num + " is: " + factorial);
	}

}
