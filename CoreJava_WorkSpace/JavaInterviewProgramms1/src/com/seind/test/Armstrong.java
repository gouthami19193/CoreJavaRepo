package com.seind.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
		int sum=0,r,c,temp;
		temp=n;
		while(n>0){
			
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n=n/10;
			
		}
		
		if(sum==temp)
			System.out.println(temp+ " is armstrong");
		else
			System.out.println(temp+ " is not armstrong");

	}

}
