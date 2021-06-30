package com.seind.test;

public class RemoveAllSpace {

	public static void main(String[] args) {
		
		String str ="India    is   my  country";
		
		String strNoSpace = str.replaceAll(" ", "");
		
		System.out.println(strNoSpace);
	}

}
