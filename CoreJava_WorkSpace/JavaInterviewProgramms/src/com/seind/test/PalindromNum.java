package com.seind.test;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
		int sum=0,r,temp;
		temp=n;
		while(n>0){
			
			r=n%10;
			
			sum=sum*10+r;
			n=n/10;
			
		}
		
		if(sum==temp)
			System.out.println(temp+ " is palindrom");
		else
			System.out.println(temp+ " is not palindrom");

		// TODO Auto-generated method stub

	}

}
