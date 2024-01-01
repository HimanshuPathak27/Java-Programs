package com.practice.codes;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		//Java Program to find Factorial of a number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Factorial");
		int num = sc.nextInt();
		sc.close();

		long factorial = num;

		for(int i=num-1; i>0; i--) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of " + num + " is: " + factorial);
	}
}