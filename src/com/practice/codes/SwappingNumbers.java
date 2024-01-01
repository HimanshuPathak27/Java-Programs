package com.practice.codes;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {

		//Java Program to Swap 2 numbers using a third number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int temp;

		System.out.println("Before Swapping: " + num1 + " ; " + num2);

		temp = num2;
		num2 = num1;
		num1 = temp;

		System.out.println("After Swapping: " + num1 + " ; " + num2);


		System.out.println("**********************************");

		//Java Program to Swap 2 numbers without using a third number

		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		sc.close();

		System.out.println("Before Swapping: " + n1 + " ; " + n2);

		n2 = n2-n1;
		n1 = n1+n2;
		n2 = n1-n2;

		System.out.println("After Swapping: " + n1 + " ; " + n2);
	}
}