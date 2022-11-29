package com.nov29;

public class stringReverseWordByWord {

	public static void main(String[] args) {
		
		String s1="hello reddy sekhar";
	
		String [] s3=s1.split(" ");
		for (int i=s3.length-1;i>=0;i--){
			
			
			System.out.print(s3[i]+" ");
		}
		
		
	}
}