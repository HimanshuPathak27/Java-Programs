package com.practice.codes;

public class ReverseSentence {

	public static void main(String[] args) {
		
		//Reverse words in a String
		String str = "'Himanshu' is name My";
		String[] words = str.split(" ");
		int numberOfWords = words.length;
		String reversedString = "";
		
		for(int i=numberOfWords-1; i>=0; i--) {
			reversedString = reversedString + words[i] + " ";
		}
		
		System.out.println(reversedString);
	}

}
