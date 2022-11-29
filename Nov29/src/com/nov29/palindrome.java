package com.nov29;

public class palindrome {
public static void main(String[] args) {
	
String str="RRR";
String Reverse="";
for (int i=str.length()-1;i>=0;i--)
Reverse=Reverse+str.charAt(i);
if (str.equals(Reverse)) 
	
	System.out.println("palindrome");

else
	System.out.println("not a palindrome");
	
}
}

