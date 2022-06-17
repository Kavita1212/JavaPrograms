package com.sample;

public class P16_Factorial {

	//Time complexity (O(n))
	public static void main(String args[]) {
		int fact;
		int number = 4;// It is the number to calculate factorial  4*3*2*1
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
	
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}