package com.sri.impQuestions;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sri";
		String str1=new String("sri");
		if(str==str1){
			System.out.println("equals -- without intern method");
		}
		
		String str2="chandra";
		String str3=new String("chandra").intern();
		if(str2==str3){
			System.out.println("equlas -- with intern method");
		}

	}

}
