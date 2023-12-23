package com.practice.codes;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//Verify if a Number is prime or not
		
		int num = 71;
		boolean isPrime = true;
		int temp = num;

		for(int i=2; i<num; i++) {
			if(temp%i==0) {
				isPrime = false;
			}
		}

		if(isPrime) System.out.println(num + " is a Prime Number");
		else System.out.println(num + " is not a Prime Number");
	}
}
