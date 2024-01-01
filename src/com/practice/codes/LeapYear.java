package com.practice.codes;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		//Java Program to check if an Year is leap year or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year(yyyy)");
		int year = sc.nextInt();
		sc.close();

		boolean leapYear = (year%4==0 && year%100!=0) || (year%400==0);

		if(leapYear) {
			System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is not a Leap Year");
		}
	}
}