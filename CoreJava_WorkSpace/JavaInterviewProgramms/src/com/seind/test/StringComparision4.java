package com.seind.test;

public class StringComparision4 {

	public static void main(String[] args) {
		
		
		String s1="gouthami";
		String s2 ="gouthami";
		String s3 =new String("gouthami");
		String s4 ="srikanth";
		String s5 = "GOUTHAMI";
		
		System.out.println(s1.compareTo(s2));   //0
		System.out.println(s1.compareTo(s3));   //0
		System.out.println(s4.compareTo(s1));   //+
		System.out.println(s1.compareTo(s4));   //-
		System.out.println(s1.compareTo(s5));   //+
		System.out.println(s1.compareToIgnoreCase(s5)); //0
		
		


	}

}
