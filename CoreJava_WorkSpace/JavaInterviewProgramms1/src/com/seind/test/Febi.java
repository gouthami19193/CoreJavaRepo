package com.seind.test;

import java.util.Scanner;

public class Febi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
		int a=0,b=0,c=1;
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}

	}

}
