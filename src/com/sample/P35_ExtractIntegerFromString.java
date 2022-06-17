package com.sample;

public class P35_ExtractIntegerFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I have 5 years experience and I am 25 years old.123 1AB234";
		//String s = "This test has no integer"; //what should be the output
		String a = FindIntCount(s);
		System.out.println("output==" +a);
				

	}
	public static String FindIntCount(String s) {
		s = s.replaceAll("[^\\d]", " ");
		System.out.println("s1==" + s);
		
		s = s.trim();
		System.out.println("s==" + s);
		
		s= s.replaceAll(" +", ", ");
		
		if(s.equals(" ")) {
			return "-1";
		//return s;
		}
		return s;
	}

}
