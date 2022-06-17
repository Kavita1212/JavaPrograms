package com.sample;

public class P32_CountNoAlphabetSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ja@va123"; //alpa 4 special 1 digit 3
		
		int alpha=0,num=0,special=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				alpha++;
			}
			else if(ch>='0' && ch<='9') {
				num++;
			}
			else {
				special++;
			}
		}
		System.out.println("Alphabets= " + alpha);
		System.out.println("Number= " + num);
		System.out.println("Special Character= " + special);
	}
}
