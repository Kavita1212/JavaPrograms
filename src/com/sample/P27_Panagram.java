package com.sample;

public class P27_Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "The quick brown fox jumps over the lazy dog";
		
		s = s.toLowerCase();
		
		System.out.println("s=="+ s);
		
		boolean allLetterPresent = true;
		
		for (char ch ='a';ch<='z';ch++) {
			System.out.println(String.valueOf(ch));
			if(!s.contains(String.valueOf(ch))) {
				allLetterPresent = false;
			}
		}
		if(allLetterPresent) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		

	}

}
