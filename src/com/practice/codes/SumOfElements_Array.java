package com.practice.codes;

public class SumOfElements_Array {

	public static void main(String[] args) {

		//Java Program to find Sum of elements of Array

		int array[] = {1,2,3,5,3,5,9,10,50,12};

		int sum=0;

		for(int element : array) {
			sum = sum + element;
		}
		System.out.println("Sum of Elements of Array: " + sum);
	}
}