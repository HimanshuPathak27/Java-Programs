package com.practice.codes;

import java.util.Scanner;

public class FinonacciSeries {

	public static void main(String[] args) {

		//Java Program to find Finonacci series of numbers

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Count of numbers required in Finonacci Series");
		int count=sc.nextInt();
		sc.close();

		int num1=0, num2=1;
		int num3;
		System.out.print("Fibonacci Series: " + num1 + " ");
		System.out.print(num2 + " ");

		for(int i=3;i<=count;i++) {
			num3=num1+num2;
			System.out.print(num3 + " ");

			num1=num2;
			num2=num3;	
		}
	}
}