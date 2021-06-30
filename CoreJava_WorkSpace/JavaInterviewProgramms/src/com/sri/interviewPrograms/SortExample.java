package com.sri.interviewPrograms;
// A sample Java program to sort an array of strings 
// in ascending and descending orders using Arrays.sort(). 
import java.util.Arrays; 
import java.util.Collections; 

public class SortExample 
{ 
	public static void main(String[] args) 
	{ 
		String arr[] = {"srikanth","anjana","mahesh"}; 

		// Sorts arr[] in ascending order 
		Arrays.sort(arr); 
		System.out.println( Arrays.asList(arr)); 
		

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.println(Arrays.toString(arr)); 
	} 
} 
