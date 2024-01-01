package com.practice.codes;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {

		//Java Program to Reverse words in a String

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		sc.close();

		String[] words = str.split(" ");
		int numberOfWords = words.length;
		String reversedString = "";

		for(int i=numberOfWords-1; i>=0; i--) {
			reversedString = reversedString + words[i] + " ";
		}

		System.out.println("Reversed String: " + reversedString);
	}
}