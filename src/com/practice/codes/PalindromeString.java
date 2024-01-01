package com.practice.codes;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		//Java Program to check if a String is Palindrome or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = sc.nextLine();
		sc.close();
		
		String reversedStr = "";
		int strLen = str.length();

		for(int i=strLen-1;i>=0;i--) {
			reversedStr = reversedStr + str.charAt(i);
		}

		System.out.println("ReversedStr = " + reversedStr);

		if(reversedStr.equals(str)) 
			System.out.println(str + " is a Palindrome String");

		else 
			System.out.println(str + " is not a Palindrome String");

	}
}