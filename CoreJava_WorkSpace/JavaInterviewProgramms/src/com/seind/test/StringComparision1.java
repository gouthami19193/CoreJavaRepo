package com.seind.test;

public class StringComparision1 {

	public static void main(String[] args) {
		
		String s1="gouthami";
		String s2 ="gouthami";
		String s3 =new String("gouthami");
		String s4 ="srikanth";
		
		System.out.println(s1.equals(s2));   //true
		System.out.println(s1.equals(s3));   //true
		System.out.println(s1.equals(s4));   //false
		System.out.println(s2.equals(s3));  //true
		

	}

}
