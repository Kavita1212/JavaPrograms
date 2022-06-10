package com.sample;

import java.util.ArrayList;

public class MultipleIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		
		System.out.println(arr);
		
		ArrayList<Integer> op = new ArrayList<>();
		int n = arr.size();
		for (int i = 0; i < n; i++) {
			int prod=1;
			for (int j = 0; j < n; j++) {
				if(i==j) 
					continue;
				prod=prod*arr.get(j);
				
			}
			op.add(prod);
		}
 System.out.println("op=="+op);
	}

}
