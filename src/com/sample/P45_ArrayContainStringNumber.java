package com.sample;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P45_ArrayContainStringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] values = {"AB","BC","CD","AE"};
		boolean contains = Arrays.stream(values).anyMatch("AB"::equals);
		
		System.out.println("output=="+contains);
		
		int[] a = {1,2,3,4};
		boolean containsNumber = IntStream.of(a).anyMatch(x -> x == 4);
		System.out.println("outputNumber=="+containsNumber);
	}

}
