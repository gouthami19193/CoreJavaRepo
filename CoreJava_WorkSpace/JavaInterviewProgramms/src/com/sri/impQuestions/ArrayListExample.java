package com.sri.impQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
         
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         
        //remove all elements from second list
        listTwo.removeAll(listOne);
         
        System.out.println(listTwo);
        System.out.println(listOne);
    }
}