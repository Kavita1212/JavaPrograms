package com.sample;

public class P23_SwapWordIfSpecialCharacterEncountered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kavita@Java";

		/*
		 * char a[]=s.toCharArray();
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */

		String a1[] = s.split("@");
		
		String rev="";
		String rev1 = null ;
			
		for (int i = a1.length-1; i >=0; i--) {
			String word = a1[i];

			System.out.println(word);
			rev = rev + word +"@";
			
			rev1=rev.substring(0, rev.length()-1);
		}
		
		//System.out.println("rev==" + rev);
		System.out.println("rev1==" + rev1);
	}
}