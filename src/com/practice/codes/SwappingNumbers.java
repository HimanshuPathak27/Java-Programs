package com.practice.codes;

public class SwappingNumbers {

	public static void main(String[] args) {

		//Swapping using a third number
		int num1 = 1;
		int num2 = 12;
		int temp;

		System.out.println("Before Swapping: " + num1 + " ; " + num2);

		temp = num2;
		num2 = num1;
		num1 = temp;

		System.out.println("After Swapping: " + num1 + " ; " + num2);

		
		System.out.println("**********************************");

		//Swapping without using a third number
		int n1 = 5;
		int n2 = 7;

		System.out.println("Before Swapping: " + n1 + " ; " + n2);

		n2 = n2-n1;
		n1 = n1+n2;
		n2 = n1-n2;
		
		System.out.println("After Swapping: " + n1 + " ; " + n2);
	}
}
