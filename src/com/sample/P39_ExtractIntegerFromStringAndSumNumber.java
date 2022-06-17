package com.sample;

public class P39_ExtractIntegerFromStringAndSumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I have 5 years experience and I am 25 years old.123 1AB234";
		
		int a = FindIntCount(s);
		System.out.println("output==" +a);
	}
	public static int FindIntCount(String s) {
		int sum=0;
		s = s.replaceAll("[^\\d]", " ");
		//System.out.println("s1==" + s);
		s = s.trim();
		//System.out.println("s==" + s);
		s= s.replaceAll(" +", " ");
		if(s.equals(" ")) {
			return -1;
		
		}
		System.out.println("S==="+s);
		String b[] = s.split(" ");
		for (int i = 0; i < b.length; i++) {
			sum = sum+Integer.parseInt(b[i]);
			System.out.println(b[i]);
		}
		return sum;
	}

}
