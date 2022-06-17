package com.sample;

import java.util.Arrays;

public class P21_FloatComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 48.57f;

		String s = String.valueOf(f);
		//System.out.println(s);

		String a[] = s.split("\\.");
		
		int x = Math.max(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
		System.out.println("x=="+x);
		
		/*
		 * int max=Integer.parseInt(a[0]);
		 * 
		 * for(int i=0;i<a.length;i++) { if(Integer.parseInt(a[i])>max) max
		 * =Integer.parseInt(a[i]); } System.out.println("max=="+max);
		 */
		
	}

}