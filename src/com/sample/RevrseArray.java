package com.sample;

public class RevrseArray {

	/*
	 * The function reverseArray modify the input list by reversing its elements.
	 * The function/method reverseArray accepts two arguments-len,an integer
	 * representing the length of list and arr,list of integers representing the
	 * input list respectively.
	 * 
	 * For example,if the input list arr is{20 30 10 40 50} the function/method is
	 * supposed to print {50 40 10 30 20}
	 */
	public static void main(String args[]) {

		int a[] = { 20, 30, 10, 40, 50 };
		int l = a.length;
		System.out.println("length" + l);
		// System.out.println("a" +a.toString());
		RevrseArray r = new RevrseArray();
		r.reverseArray(l, a);

	}

	public void reverseArray(int len, int[] arr) {
		// int i , temp;

		
		/*
		 * int i , temp; int originalLen = len; for (i = 0; i < len/2; i++) { temp =
		 * arr[originalLen-1]; arr[originalLen-1]= arr[i]; arr[i] = temp; originalLen
		 * +=1;
		 * 
		 * }
		 */
		
		int i, temp, k;
		int originalLen = len;
		System.out.println("originallen" + originalLen);
		for (i = 0; i < len / 2; i++) {

			temp = arr[originalLen - 1];
			arr[originalLen - 1] = arr[i];
			arr[i] = temp;
			//originalLen += 1;
			originalLen -= 1;

			/*
			 * temp = arr[i]; arr[i] = arr[len - i - 1]; arr[len - i - 1] = temp;
			 */
			// System.out.println(arr[i]);
		}

		// System.out.println(arr[i]); //50 40 10 30 20

		
		  System.out.println("Reversed array is: \n"); for (k = 0; k < len; k++) {
		  System.out.println(arr[k]); }
		 

	}
}
