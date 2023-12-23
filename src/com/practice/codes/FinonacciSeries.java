 package com.practice.codes;

public class FinonacciSeries {

	public static void main(String[] args) {
		
		//Finonacci series of numbers
		int num1=0, num2=1;
		int num3;
		int series=10;
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		
		for(int i=3;i<=series;i++) {
			num3=num1+num2;
			System.out.print(num3 + " ");
			
			num1=num2;
			num2=num3;	
		}
	}

}
 