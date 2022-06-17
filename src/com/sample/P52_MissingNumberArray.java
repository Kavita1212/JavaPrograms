package com.sample;

public class P52_MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 5, 6 };
			
		int n = a.length;
		int sum =(n*(n+1))/2;
		
		for (int i = 0; i < n; i++) {
			sum-=a[i];
		}
		System.out.println(sum);		
	}
}