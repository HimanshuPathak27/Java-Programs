package com.practice.codes;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		//Java Program to find area of triangle
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base");
		int base = sc.nextInt();
		System.out.println("Enter Height");
		int height = sc.nextInt();
		sc.close();
		
		int area = (base*height)/2;
		System.out.println("Area of triangle with Base:" + base + " and Height:" + height + " is = " +area );
		
	}
}