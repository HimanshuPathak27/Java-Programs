package com.practice.codes;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		//Java Program to find Sum of digits of a Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		int temp = num;

		while(temp>0) {
			sum = sum + temp%10;
			temp = temp/10;
		}

		System.out.println("Sum of digits of " + num + " is " + sum);
	}
}