package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is hyderabad and this is part of india";
		
		String search ="is";
		int count=0;
		Pattern pattern = Pattern.compile(search, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			count++;
			System.out.println(matcher.group());
		}
//		System.out.println(matcher+ "===" +count);
		System.out.println(count);
		

	}

}
