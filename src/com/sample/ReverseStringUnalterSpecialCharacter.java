package com.sample;

public class ReverseStringUnalterSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab@cde.f"; // fe@dcb.a

		System.out.println(str.length());
		char[] arr = str.toCharArray();

		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		for (int i = 0, j = str.length() - 1; i < j;) {

			if (alphaNumericCheck(arr[i]) && alphaNumericCheck(arr[j])) {
				char tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			} else if (!alphaNumericCheck(arr[i])) {
				i++;
			} else if (!alphaNumericCheck(arr[j])) {
				j--;
			}
		}
		System.out.println("Reversed String : " + String.valueOf(arr));

	}

	public static boolean alphaNumericCheck(char ch) {
		if ((ch >= 48 && ch <= 57) // Numeric 0 to 9
				|| (ch >= 65 && ch <= 90) // Alphabet A to Z (caps)
				|| (ch >= 97 && ch <= 122)) // Alphabet a to z
			return true;
		else
			return false;
	}
}