package com.sample;

public class P5_SwapString {
	public static void main(String[] args) {

		/*
		 * String a = "hello"; //5 // 1 object getting created in string constant pool
		 * //String b = "world";//5
		 * 
		 * System.out.println("Before swap: " + a + " " + b);
		 * 
		 * a = a + b; // helloworld b = a.substring(0, a.length() - b.length());
		 * //helloworld.sub(0,10-5) //helloworld-hello a = a.substring(b.length());
		 * //helloworld.sub(5) //hello world -world
		 * 
		 * System.out.println("After : " + a + " " + b);
		 * 
		 * 
		 * 
		 * //2 types String b = "hello"; //true --- string constant pool //String b =
		 * new String("hello"); //false //2 object will created 1-heap memory,1-string
		 * constant pool //b-heap memory area(address) //== : object refrerence //object
		 * : creating address: get address i nmemory heap area //a==b :false //if(a==b)
		 * { System.out.println(a==b);
		 */
		// }

		// .equals in string : content comparison
		
		 String a = "hello"; //5 // 1 object getting created in string constant pool
		 String b = "world";//5
		 
		 System.out.println("Before swap: " + a + " " + b);
		 
		 a = a + b; // helloworld
		 b = a.substring(0, a.length() - b.length());
		 //helloworld.sub(0,10-5) //helloworld-hello
		 a = a.substring(b.length());
		  //helloworld.sub(5) //hello world -world
		  
		  System.out.println("After : " + a + " " + b);
		  

	}
}
