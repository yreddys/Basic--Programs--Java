package com.nov29;

public class stringReverseCharactorsWordsConstant {
public static void main(String[] args) {
	
	String str="Hello reddy sekhar";
	String []str3=str.split(" ");
	String str2="";
	for(int i=str3.length-1;i>=0;i--) {
		String str4=str3[i];
		String str5="";
		for (int j=str4.length()-1;j>=0;j--) {
			str5=str5+str4.charAt(j);
		}
		
		str2=str2+str5+" ";
	}
	System.out.println(str2);
	
}
}

public class Reverse {

	
		  public static void main(String[] args) {
		    String str = "Hello reddy sekhar";
		    for (int i = str.length() - 1; i >= 0; i--) {
		      System.out.print(str.charAt(i));
		    }
		  }
		}

o/p: rahkes ydder olleH
