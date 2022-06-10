package com.sample;

public class DuplicateCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] ={"chennai","kolkata","mumbai","chennai"};
		//int count=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
				
			}
			if(count>1) {
			System.out.println(a[i]);
			}
		}

	}

}
