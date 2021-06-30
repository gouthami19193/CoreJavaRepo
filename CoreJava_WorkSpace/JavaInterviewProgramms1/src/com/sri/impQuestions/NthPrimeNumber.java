package com.sri.impQuestions;

import java.util.Scanner;

public class NthPrimeNumber {
	
	public void nThPrimeNumber(int num){
		
		int tempNum=0;
		for(int i=1;i<=100000;i++){
			int count=0;
			for (int j = 1; j <= i; j++) {
				
				if(i%j==0){
					count++;
				}
				
			}
			if(count==2){
				tempNum++;
			}
			if(tempNum==num){
				System.out.println("The Nth Prime Number is :"+i);
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     NthPrimeNumber n=new NthPrimeNumber();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the Nth Prime Number :");
     n.nThPrimeNumber(s.nextInt());
	}

}
