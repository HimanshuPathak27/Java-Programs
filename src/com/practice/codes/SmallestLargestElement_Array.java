package com.practice.codes;

import java.util.Arrays;

public class SmallestLargestElement_Array {

	public static void main(String[] args) {

		//Java Program to find Smallest and largest elements in array using sorting

		int array[] = {9,8,9,7,0,3,2,5};
		Arrays.sort(array);
		int arrayLength = array.length;

		int smallestElement = array[0];
		int largestElement = array[arrayLength-1];

		System.out.println("Smallest Element: " + smallestElement);
		System.out.println("Largest Element: " + largestElement);

		System.out.println("**************************************");

		//Java Program to find Smallest and largest elements in array without using sorting
		int arr[] = {12,15,10,2,9,99,3,-5};
		int arrLength = arr.length;
		int min = arr[0];
		int max = arr[0];

		for(int i=0; i<=arrLength-1; i++) {
			if(arr[i]<arr[0]) {
				min=arr[i];
			}
			if(arr[i]>arr[0]) {
				max=arr[i];
			}
		}
		System.out.println("Smallest Element: " + min);
		System.out.println("Largest Element: " + max);
	}
}