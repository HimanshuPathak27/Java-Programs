package com.practice.codes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		//Java Program to verify if a Number is prime or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();

		boolean isPrime = true;
		int temp = num;

		for(int i=2; i<num; i++) {
			if(temp%i==0) {
				isPrime = false;
			}
		}

		if(isPrime) System.out.println(num + " is a Prime Number");
		else System.out.println(num + " is not a Prime Number");
	}
}
