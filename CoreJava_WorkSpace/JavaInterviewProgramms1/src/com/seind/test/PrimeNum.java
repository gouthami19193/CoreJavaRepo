package com.seind.test;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
	
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
          int n=sc.nextInt();
          
          for(int i=1;i<=n;i++) {
        	  
        	  if(n%i==0)
        		  count++;
          }
          if(count==2)
        	  System.out.println(n + " is prime number");
          else
        	  System.out.println(n + " is not prime number");

	}

}
