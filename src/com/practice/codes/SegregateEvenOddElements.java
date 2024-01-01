package com.practice.codes;

public class SegregateEvenOddElements {

	public static void main(String[] args) {

		//Java Program to Segregate Even and Odd Elements from an Array

		int numArray[] = {10,11,12,13,14,15};

		System.out.print("Even Elements in Array : ");
		for(int num : numArray) {
			if (num%2==0) {
				System.out.print(num + " ");
			}
		}

		System.out.println();
		System.out.print("Odd Elements in Array : ");
		for(int num : numArray) {
			if (num%2!=0) {
				System.out.print(num + " ");
			}
		}
	}
}