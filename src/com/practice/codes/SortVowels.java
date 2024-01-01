package com.practice.codes;

import java.util.Scanner;

public class SortVowels {

	public static void main(String[] args) {

		//Java Program to Sort vowels from a string

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();

		int strLen = str.length();

		for(int i=0; i<strLen; i++) {
			char charInString = str.charAt(i);
			if(charInString=='a' || charInString=='e' || charInString=='i' || charInString=='o' || charInString=='u') {
				System.out.println("Chracter : " + charInString + " | Position In String : " + (i+1));
			}
		}
	}
}