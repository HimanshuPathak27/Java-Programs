package com.practice.codes;

public class SumOfDigits {

	public static void main(String[] args) {
		
		// Sum of digits of a Number
		int num = 52841;
		int sum = 0;
		int temp = num;
		
		while(temp>0) {
		sum = sum + temp%10;
		temp = temp/10;
		}
		
		System.out.println("Sum of digits of " + num + " is " + sum);
	}

}
