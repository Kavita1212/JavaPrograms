package com.sample;

import java.util.Arrays;

public class P26_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //isAnagram("Keep", "Peek");  
		  isAnagram("neat", "a net");  //anagram
	}
	 static void isAnagram(String str1, String str2) { 
		 boolean status = true;
		 int n = str1.length();
		 int n1 = str2.length();
		 
		 if(n!=n1) {
			 status=false;
		 }
		 else {
			 char a[] = str1.toLowerCase().toCharArray();
			 char a1[] = str2.toLowerCase().toCharArray();
			 
			 Arrays.sort(a);
			 Arrays.sort(a1);
			 status = Arrays.equals(a, a1);
		 }
		 if(status) {
			 System.out.println(str1 +" and " +str2+ " are anagrams");
		 }else {  
	            System.out.println(str1 + " and " + str2 + " are not anagrams");  
	        }  
	 }
}
