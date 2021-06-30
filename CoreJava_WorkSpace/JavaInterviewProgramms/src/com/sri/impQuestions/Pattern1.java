package com.sri.impQuestions;

public class Pattern1 {
	
	public void leftPattern(int n){
		for (int i = 1; i <=n ; i++) {
			for (int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void leftPatternNumber(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = i,k=1; j >0; j--,k++) {
				System.out.print(k);
			}
			System.out.println();
			
		}
	}
	
	public void leftPatternNumber1(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = i; j >0; j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
	
	public void leftPatternStar(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	//middle pattern
	public void ModilePatternNum(int n){
		int z=1;
		for (int i = 0; i <n; i++) {
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
			for (int k = 0; k< z; k++) {
				System.out.print(z-i);
			}
			z+=2;
			System.out.println();
		}
		
	}
	
	public void middlePatternStar(int n){
	 int z=1;
	 
	 for (int i = 0; i < n; i++) {
		 for (int j = n-1; j >i; j--) {
			System.out.print(" ");
		}
		 
		 for (int k = 0; k < z; k++) {
			System.out.print("*");
		}
		 System.out.println();
		 z+=2;
		
	}
	}
	
	public void middlePatternNumSeq(int n){
		 int z=1;
		 
		 for (int i = 0; i < n; i++) {
			 for (int j = n-1; j >i; j--) {
				System.out.print(" ");
			}
			 
			 for (int k = 0; k < z; k++) {
				System.out.print(k+1);
			}
			 System.out.println();
			 z+=2;
			
		}
		}
	
	public void rightPatterStar(int n){
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 p=new Pattern1();
		//p.leftPattern(5);
		//p.leftPatternNumber(5);
		//p.leftPatternStar(5);
		//p.leftPatternNumber1(5);
		//p.ModilePatternNum(5);
		//p.middlePatternStar(5);
		p.middlePatternNumSeq(5);
		p.rightPatterStar(5);

	}

}
