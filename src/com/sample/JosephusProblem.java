package com.sample;

public class JosephusProblem {
	// method to find the position of the Most
	// Significant Bit
	static int msbPos(int n) {
		int pos = 0;
		while (n != 0) {
			pos++;

			// keeps shifting bits to the right
			// until we are left with 0
			n = n >> 1;
		}
		return pos;
	}

	// method to return at which place Josephus
	// should sit to avoid being killed
	static int josephify(int n) {
		int position = msbPos(n);

		int j = 1 << (position - 1);

		n = n ^ j;

		n = n << 1;

		n = n | 1;

		return n;
	}

	// Driver Method
	public static void main(String[] args) {
		int n = 5;
		System.out.println(josephify(n));
	}
}
