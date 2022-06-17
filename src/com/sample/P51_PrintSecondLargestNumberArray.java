package com.sample;

public class P51_PrintSecondLargestNumberArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,6,10,2};
		int len =a.length;
		//System.out.println(len);
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) { //sort in ascending order
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]); //print in ascending order
		}
		System.out.println("len"+ len +"a=="+ a[len-2]);
		}
	}