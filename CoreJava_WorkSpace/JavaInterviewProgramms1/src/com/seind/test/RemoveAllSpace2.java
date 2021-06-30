package com.seind.test;

public class RemoveAllSpace2 {

	public static void main(String[] args) {
		
		String str ="India    is   my  country";
		
		char[] strArray =str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for( int i=0; i<strArray.length; i++) {
			
			
			if( (strArray[i]!=' ')&&(strArray[i]!='\t')) {
				
				sb.append(strArray[i]);
				
			}
		}
		String noSpaceStr =sb.toString();
		System.out.println(noSpaceStr);

	}

}
