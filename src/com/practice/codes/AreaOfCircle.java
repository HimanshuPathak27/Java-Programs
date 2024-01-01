package com.practice.codes;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		//Java Program to find area of circle

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius = sc.nextInt();
		sc.close();

		double area = 3.14*Math.pow(radius, 2);
		
		System.out.println("Area of circle with Radius:" + radius + " is = " + area );

	}
}