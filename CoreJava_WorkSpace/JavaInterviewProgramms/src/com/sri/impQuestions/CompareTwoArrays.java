package com.sri.impQuestions;

import java.util.Arrays;

public class CompareTwoArrays {
	
	public void compareArrays(){
		String[] sArray={"sri","gou","anj","pra"};
		String[] sArray1={"sri","gou","anj","pra"};
		
		String[] sArray4={"sri","gou","anj","pra"};
		String[] sArray5={"sri","gou","pra","anj"};
		
		
		Object[] obj=sArray;
		Object[] sArray2=sArray1;
		
		if(Arrays.deepEquals(obj, sArray2)){
			System.out.println("deep equals");
		}else{
			System.out.println("deep not equals");
		}
		
		
		if(Arrays.equals(sArray, sArray1)==true){
			System.out.println("Both are equal ");
		}
		else{
			System.out.println("Both are not equal");
		}
		
		//compre content equal or not , not based on position
		Arrays.sort(sArray4);
		Arrays.sort(sArray5);
		System.out.println(sArray4);
		for (Object object : sArray4) {
			System.out.println(object);
			
		}
		
		if(Arrays.equals(sArray4, sArray5)){
			System.out.println("Both are equal--- ");
		}
		else{
			System.out.println("Both are not equal---");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareTwoArrays c=new CompareTwoArrays();
		c.compareArrays();

	}

}
