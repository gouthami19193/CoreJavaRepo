package com.seind.test;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number nth number");
		int n = sc.nextInt();
		int count;
		int tempnum = 0;
		for (int i = 2; i <= 100000; i++) {

			count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					count++;
			}

				if (count == 2)
					tempnum++;
			

			if (tempnum == n) {
				System.out.println("the Nth prime number is" +i );
			break;
			}

		}

	}
}
