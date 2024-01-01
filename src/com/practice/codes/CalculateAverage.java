package com.practice.codes;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {

		//Java Programs to find Average of numbers

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int elementCount = sc.nextInt();

		int[] numbers = new int[elementCount];
		System.out.println("Enter the elements:");
		
		int sum = 0;

		for (int i=0; i<elementCount; i++) {
			numbers[i] = sc.nextInt();
			sum = sum + numbers[i];
		}
		sc.close();
		
		double avg = (double)sum/elementCount;
		System.out.println("Average of Numbers is: " + avg);
	}
}