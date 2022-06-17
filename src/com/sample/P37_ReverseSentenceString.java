package com.sample;

public class P37_ReverseSentenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am from Mumbai"; //Mumbai from am I
		
		String a[]=s.split(" ");
		
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
	}
}