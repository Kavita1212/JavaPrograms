package com.sample;

import java.util.ArrayList;

public class P36_PrintDuplicateAtEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 2, 4, 2, 8, 7, 2, 2 }; // 1,4,8,7,2,2,2,2
		

		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i != j && a[i]==a[j]) {
					//System.out.println(a[j]);
					break;
				}
				
				System.out.println(a[i]);
			}
			
			
		}

	}
}