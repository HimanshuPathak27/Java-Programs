package com.practice.codes;

public class SortVowels {

	public static void main(String[] args) {
		
		String str = "PandoraeiouMobile";
		int strLen = str.length();
		
		for(int i=0; i<strLen; i++) {
			char charInString = str.charAt(i);
			if(charInString=='a' || charInString=='e' || charInString=='i' || charInString=='o' || charInString=='u') {
				System.out.println("Chracter : " + charInString + " | Position In String : " + (i+1));
			}
		}
		
		
	}

}
